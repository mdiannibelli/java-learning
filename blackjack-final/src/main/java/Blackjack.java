package src.main.java;

import javax.swing.JOptionPane;

public class Blackjack {
    public static void main(String[] args) {
        // !TODO Separar la lógica de Cartas en CardsUtils, intentar agregar imágen de
        // cartas dinámicas
        // !TODO Considerar cartas trebol, diamante, espada, corazon
        // !TODO DIAGRAMA DE FLUJO
        // !TODO Documentación README.MD

        // All BJ Cards
        String cards[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

        int userCardsValue1 = 0;
        int userCardsValue2 = 0;

        int crupierCardsValue1 = 0;
        int crupierCardsValue2 = 0;

        String userMsg = "";
        String crupierMsg = "";

        boolean winner = false;

        // Start game
        BlackjackDialog.showStartMsg();

        BlackjackDialog.showGiveUserCardsMsg();
        System.out.println("Dealing user's cards...");
        // Declare userCards array
        String[] userCards = generateRandomCards(cards, 2);
        boolean hasUserA = false;
        Object[] userResult = showUserCardsValue(userCards, userCardsValue1, userCardsValue2, hasUserA);
        hasUserA = (boolean) userResult[3];
        userMsg = (String) userResult[0];
        userCardsValue1 += (int) userResult[1];
        userCardsValue2 += (int) userResult[2];

        // Check if user has Blackjack
        winner = checkBlackjack(userCardsValue1, userCardsValue2, crupierCardsValue1, crupierCardsValue2);
        if (winner)
            return;

        BlackjackDialog.showGiveCrupierCardsMsg();
        System.out.println("Dealing crupier's cards...");
        // Declare crupierCards array
        String[] crupierCards = generateRandomCards(cards, 1);
        boolean hasCrupierA = false;
        Object[] crupierResult = showCrupierCardsValue(crupierCards, crupierCardsValue1, crupierCardsValue2,
                hasCrupierA);
        hasCrupierA = (boolean) crupierResult[3];
        crupierMsg = (String) crupierResult[0];
        crupierCardsValue1 += (int) crupierResult[1];
        crupierCardsValue2 += (int) crupierResult[2];

        String options[] = { "Request card", "Stand" };
        var selection = JOptionPane.showOptionDialog(
                null,
                userMsg + " & " + crupierMsg,
                "Phase 3",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[1]);

        if (selection == 0) {
            // Generate user card;
            BlackjackDialog.showGiveUserCardsMsg();
            do {
                System.out.println("Dealing user's cards...");
                userCards = generateRandomCards(cards, 1);
                Object[] userNewCard = showUserCardsValue(userCards, userCardsValue1, userCardsValue2, hasUserA);
                userCardsValue1 = (int) userNewCard[1];
                userCardsValue2 = (int) userNewCard[2];
                hasUserA = (boolean) userNewCard[3];

                // Check if user has Blackjack
                winner = checkBlackjack(userCardsValue1, userCardsValue2, crupierCardsValue1, crupierCardsValue2);
                if (winner)
                    return;

                // Show option again
                if (userCardsValue1 < 21 | userCardsValue2 < 21) {
                    var requestAnotherCard = JOptionPane.showOptionDialog(
                            null,
                            "Your cards add up " + userCardsValue1 + "/" + userCardsValue2,
                            "Phase 3",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.INFORMATION_MESSAGE,
                            null,
                            options,
                            options[1]);
                    if (requestAnotherCard == 1) {
                        generateCrupierCards(crupierCards, crupierCardsValue1, crupierCardsValue2, hasCrupierA, winner,
                                userCardsValue1, userCardsValue2, cards);
                        break;
                    }
                }
            } while (userCardsValue1 < 21 | userCardsValue2 < 21);

            // User over 21
            if (userCardsValue1 > 21 && userCardsValue2 > 21) {
                JOptionPane.showMessageDialog(null, "You're over 21, you lose.", "Game Over",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }

        if (selection == 1) {
            // Generate crupier card;
            generateCrupierCards(crupierCards, crupierCardsValue1, crupierCardsValue2, hasCrupierA, winner,
                    userCardsValue1, userCardsValue2, cards);
        }
    }

    public static String[] generateRandomCards(String cards[], int quantity) {
        // Give the cards to the person (user or crupier)
        String newCards[] = new String[quantity];
        int counter = 0;
        do {
            int randomCard = (int) Math.floor(Math.random() * cards.length);
            newCards[counter] = cards[randomCard];
            System.out.println("Card " + (counter + 1) + ": " + newCards[counter]);
            JOptionPane.showMessageDialog(null, newCards[counter], "Card " + (counter + 1) + ": ",
                    JOptionPane.INFORMATION_MESSAGE);
            counter++;
        } while (counter < quantity);

        return newCards;
    }

    public static Object[] showUserCardsValue(String userCards[], int personValue1, int personValue2, boolean hasA) {
        // Show user cards value
        // boolean hasA = false;
        for (int i = 0; i < userCards.length; i++) {
            if (userCards[i] == null)
                break;
            if (userCards[i] == "K" || userCards[i] == "J" || userCards[i] == "Q") {
                personValue2 += 10;
                personValue1 += 10;
            } else if (userCards[i] == "A") {
                personValue2 += 1;
                personValue1 += 11;
                hasA = true;
            } else {
                personValue1 += Integer.parseInt(userCards[i]);
                personValue2 += Integer.parseInt(userCards[i]);
            }
        }

        String userMsg;
        if (hasA && personValue1 != 21) {
            userMsg = "Your cards add up " + Integer.toString(personValue1) + "/" + Integer.toString(personValue2);
            JOptionPane.showMessageDialog(null, userMsg, "Total value:",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            userMsg = "Your cards add up " + personValue1;
            JOptionPane.showMessageDialog(null, "Your cards add up " + personValue1, "Total value:",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        return new Object[] { userMsg, personValue1, personValue2, hasA };
    }

    public static Object[] showCrupierCardsValue(String crupierCards[], int personValue1, int personValue2,
            boolean hasA) {
        // Show crupier cards value
        // boolean hasA = false;
        for (int i = 0; i < crupierCards.length; i++) {
            if (crupierCards[i] == null)
                break;
            if (crupierCards[i] == "K" || crupierCards[i] == "J" || crupierCards[i] == "Q") {
                personValue1 += 10;
                personValue2 += 10;
            } else if (crupierCards[i] == "A") {
                personValue2 += 1;
                personValue1 += 11;
                hasA = true;
            } else {
                personValue1 += Integer.parseInt(crupierCards[i]);
                personValue2 += Integer.parseInt(crupierCards[i]);
            }

        }

        String crupierMsg;
        if (hasA && personValue1 != 21) {
            crupierMsg = "Crupier cards add up " + Integer.toString(personValue1) + "/"
                    + Integer.toString(personValue2);
            JOptionPane.showMessageDialog(null, crupierMsg, "Total value:",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            crupierMsg = "Crupier cards add up " + personValue1;
            JOptionPane.showMessageDialog(null, "Crupier cards add up " + personValue1, "Total value:",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        return new Object[] { crupierMsg, personValue1, personValue2, hasA };
    }

    public static boolean checkBlackjack(int userCardsValue, int userCardsValue2, int crupierCardsValue,
            int crupierCardsValue2) {
        boolean isBlackjack = false;
        if (userCardsValue == 21 || userCardsValue2 == 21 || crupierCardsValue == 21 || crupierCardsValue2 == 21) {
            isBlackjack = true;
        }

        if (isBlackjack) {
            if (userCardsValue == 21 || userCardsValue2 == 21) {
                JOptionPane.showMessageDialog(null, "Blackjack!, You win.", "Game over",
                        JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Blackjack!, You win.");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Blackjack!, Crupier wins and you lose.", "Game over",
                        JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Blackjack!, Crupier wins and you lose.");
                return true;
            }
        }
        return false;
    }

    public static void showWinner(int crupierCardsValue1, int crupierCardsValue2, int userCardsValue1,
            int userCardsValue2) {
        if (crupierCardsValue1 > 21 && crupierCardsValue2 > 21) {
            JOptionPane.showMessageDialog(null, "Crupier is over 21, user win!", "Game over",
                    JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Crupier is over 21, user win!");
            return;
        } else {
            if (crupierCardsValue1 > userCardsValue1 | crupierCardsValue2 > userCardsValue2
                    | crupierCardsValue1 > userCardsValue2 | crupierCardsValue2 > userCardsValue1) {
                JOptionPane.showMessageDialog(null, "Crupier won!", "Game over",
                        JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Crupier won!");
                return;
            } else {
                JOptionPane.showMessageDialog(null, "User won!", "Game over",
                        JOptionPane.INFORMATION_MESSAGE);
                System.out.println("User won!");
                return;
            }
        }
    }

    public static void generateCrupierCards(String crupierCards[], int crupierCardsValue1, int crupierCardsValue2,
            boolean hasCrupierA, boolean winner, int userCardsValue1, int userCardsValue2, String cards[]) {
        // Generate crupier card;
        BlackjackDialog.showGiveCrupierCardsMsg();
        do {
            System.out.println("Dealing crupier's cards...");
            crupierCards = generateRandomCards(cards, 1);
            Object[] crupierNewCard = showCrupierCardsValue(crupierCards, crupierCardsValue1,
                    crupierCardsValue2,
                    hasCrupierA);
            crupierCardsValue1 = (int) crupierNewCard[1];
            crupierCardsValue2 = (int) crupierNewCard[2];
            hasCrupierA = (boolean) crupierNewCard[3];

            // Check if crupier has Blackjack
            winner = checkBlackjack(userCardsValue1, userCardsValue2, crupierCardsValue1,
                    crupierCardsValue2);
            if (winner)
                return;
        } while (crupierCardsValue1 < 17 | crupierCardsValue2 < 17);

        // Show Winner
        showWinner(crupierCardsValue1, crupierCardsValue2, userCardsValue1, userCardsValue2);
    }
}