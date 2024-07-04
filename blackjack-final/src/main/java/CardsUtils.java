package src.main.java;

import javax.swing.JOptionPane;

public class CardsUtils {
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
            BlackjackDialog.userCardsAddUp(userMsg);
        } else {
            userMsg = "Your cards add up " + personValue1;
            BlackjackDialog.userCardsAddUp(userMsg);
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
            BlackjackDialog.crupierCardsAddUp(crupierMsg);
        } else {
            crupierMsg = "Crupier cards add up " + personValue1;
            BlackjackDialog.crupierCardsAddUp(crupierMsg);
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
                BlackjackDialog.showBlackjack("You have a Blackjack!");
                BlackjackDialog.showUserWin("You won.");
                System.out.println("Blackjack!, You win.");
                return true;
            } else {
                BlackjackDialog.showBlackjack("Crupier has a Blackjack");
                System.out.println("Blackjack!, Crupier wins and you lose.");
                return true;
            }
        }
        return false;
    }

    public static void showWinner(int crupierCardsValue1, int crupierCardsValue2, int userCardsValue1,
            int userCardsValue2) {
        if (crupierCardsValue1 > 21 && crupierCardsValue2 > 21) {
            BlackjackDialog.showUserWin("Crupier is over 21, user win!");
            System.out.println("Crupier is over 21, user won!");
            return;
        } else {
            if (crupierCardsValue1 > userCardsValue1 | crupierCardsValue2 > userCardsValue2
                    | crupierCardsValue1 > userCardsValue2 | crupierCardsValue2 > userCardsValue1) {
                BlackjackDialog.showUserLose("Crupier won!");
                System.out.println("Crupier won!");
                return;
            } else {
                BlackjackDialog.showUserWin("User won!");
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
