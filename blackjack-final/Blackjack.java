import javax.swing.JOptionPane;

public class Blackjack {
    public static void main(String[] args) {
        // All BJ Cards
        String cards[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

        String userCards[] = new String[2];
        String crupierCards[] = new String[2];
        String userMsg = "";
        String crupierMsg = "";

        boolean winner = false;

        JOptionPane.showMessageDialog(null, "Dealing cards to the user..", "Phase 1", JOptionPane.INFORMATION_MESSAGE);
        generateRandomCards(cards, userCards);
        Object[] userResult = showUserCardsValue(userCards);
        userMsg = (String) userResult[0];

        // Check if user has Blackjack
        winner = checkBlackjack((int) userResult[1], (int) userResult[2], 0, 0);
        if (winner)
            return;

        JOptionPane.showMessageDialog(null, "Dealing cards to the crupier..", "Phase 2",
                JOptionPane.INFORMATION_MESSAGE);
        generateRandomCards(cards, crupierCards);
        Object[] crupierResult = showCrupierCardsValue(crupierCards);
        crupierMsg = (String) crupierResult[0];

        // Check if crupier has Blackjack
        winner = checkBlackjack(0, 0, (int) crupierResult[1], (int) crupierResult[2]);
        if (winner)
            return;

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
            // Request card;
        }

        if (selection == 1) {
            // Generate crupier card;
        }
    }

    public static void generateRandomCards(String cards[], String personCards[]) {
        // Give the cards to the person (user or crupier)
        int counter = 0;
        do {
            int randomCard = (int) Math.floor(Math.random() * cards.length);
            personCards[counter] = cards[randomCard];
            System.out.println("Card " + (counter + 1) + ": " + personCards[counter]);
            JOptionPane.showMessageDialog(null, personCards[counter], "Card " + (counter + 1) + ": ",
                    JOptionPane.INFORMATION_MESSAGE);
            counter++;
        } while (counter < 2);
    }

    public static Object[] showUserCardsValue(String userCards[]) {
        // Show user cards value
        int userCardsValue = 0;
        boolean hasA = false;
        int userCardsValue2 = 0;
        for (int i = 0; i < userCards.length; i++) {
            if (userCards[i] == "K" || userCards[i] == "J" || userCards[i] == "Q") {
                userCardsValue += 10;
            } else if (userCards[i] == "A") {
                userCardsValue2 += 1;
                userCardsValue += 11;
                hasA = true;
            } else {
                userCardsValue += Integer.parseInt(userCards[i]);
            }
        }

        if (userCards[0] == "A" && userCards[1] == "A") {
            userCardsValue2 = 2;
        } else {
            userCardsValue2 = userCardsValue2 + (userCardsValue - 11);
        }

        String userMsg;
        if (hasA) {
            userMsg = "Your cards add up " + Integer.toString(userCardsValue) + "/" + Integer.toString(userCardsValue2);
            JOptionPane.showMessageDialog(null, userMsg, "Total value:",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            userMsg = "Your cards add up " + userCardsValue;
            JOptionPane.showMessageDialog(null, "Your cards add up " + userCardsValue, "Total value:",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        return new Object[] { userMsg, userCardsValue, userCardsValue2 };
    }

    public static Object[] showCrupierCardsValue(String crupierCards[]) {
        // Show crupier cards value
        int crupierCardsValue = 0;
        boolean hasA = false;
        int crupierCardsValue2 = 0;
        for (int i = 0; i < crupierCards.length; i++) {
            if (crupierCards[i] == "K" || crupierCards[i] == "J" || crupierCards[i] == "Q") {
                crupierCardsValue += 10;
            } else if (crupierCards[i] == "A") {
                crupierCardsValue2 += 1;
                crupierCardsValue += 11;
                hasA = true;
            } else {
                crupierCardsValue += Integer.parseInt(crupierCards[i]);
            }
        }

        if (crupierCards[0] == "A" && crupierCards[1] == "A") {
            crupierCardsValue2 = 2;
        } else {
            crupierCardsValue2 = crupierCardsValue2 + (crupierCardsValue - 11);
        }

        String crupierMsg;
        if (hasA) {
            crupierMsg = "Crupier cards add up " + Integer.toString(crupierCardsValue) + "/"
                    + Integer.toString(crupierCardsValue2);
            JOptionPane.showMessageDialog(null, crupierMsg, "Total value:",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            crupierMsg = "Crupier cards add up " + crupierCardsValue;
            JOptionPane.showMessageDialog(null, "Crupier cards add up " + crupierCardsValue, "Total value:",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        return new Object[] { crupierMsg, crupierCardsValue, crupierCardsValue2 };
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

}