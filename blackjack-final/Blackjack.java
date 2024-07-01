import javax.swing.JOptionPane;

public class Blackjack {
    public static void main(String[] args) {
        // All BJ Cards
        String cards[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

        String userCards[] = new String[2];
        String crupierCards[] = new String[2];

        generateRandomUserCards(cards, userCards);
        showUserCardsValue(userCards);

    }

    public static void generateRandomUserCards(String cards[], String userCards[]) {
        // Give the cards to the user
        int counter = 0;
        do {
            int randomCard = (int) Math.floor(Math.random() * cards.length);
            userCards[counter] = cards[randomCard];
            System.out.println("Card " + (counter + 1) + ": " + userCards[counter]);
            JOptionPane.showMessageDialog(null, userCards[counter], "Card " + (counter + 1) + ": ",
                    JOptionPane.INFORMATION_MESSAGE);
            counter++;
        } while (counter < 2);
    }

    public static void showUserCardsValue(String userCards[]) {
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

        if (hasA) {
            String msg = Integer.toString(userCardsValue) + "/" + Integer.toString(userCardsValue2);
            JOptionPane.showMessageDialog(null, "Your cards add up " + msg, "Total value:",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Your cards add up " + userCardsValue, "Total value:",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}