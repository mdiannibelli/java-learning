package src.main.java;

public class Blackjack {
    public static void main(String[] args) {
        // !TODO Imagenes de cartas dinámicas
        // !TODO Considerar cartas trebol, diamante, espada, corazon
        // !TODO DIAGRAMA DE FLUJO
        // !TODO Documentación README.MD
        // !TODO Implementar apuesta y saldo

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
        String[] userCards = CardsUtils.generateRandomCards(cards, 2);
        boolean hasUserA = false;
        Object[] userResult = CardsUtils.showUserCardsValue(userCards, userCardsValue1, userCardsValue2, hasUserA);
        hasUserA = (boolean) userResult[3];
        userMsg = (String) userResult[0];
        userCardsValue1 += (int) userResult[1];
        userCardsValue2 += (int) userResult[2];

        // Check if user has Blackjack
        winner = CardsUtils.checkBlackjack(userCardsValue1, userCardsValue2, crupierCardsValue1, crupierCardsValue2);
        if (winner)
            return;

        BlackjackDialog.showGiveCrupierCardsMsg();
        System.out.println("Dealing crupier's cards...");
        // Declare crupierCards array
        String[] crupierCards = CardsUtils.generateRandomCards(cards, 1);
        boolean hasCrupierA = false;
        Object[] crupierResult = CardsUtils.showCrupierCardsValue(crupierCards, crupierCardsValue1, crupierCardsValue2,
                hasCrupierA);
        hasCrupierA = (boolean) crupierResult[3];
        crupierMsg = (String) crupierResult[0];
        crupierCardsValue1 += (int) crupierResult[1];
        crupierCardsValue2 += (int) crupierResult[2];

        int selection = BlackjackDialog.showUserOptions(userMsg + " & " + crupierMsg);

        if (selection == 0) {
            // Generate user card;
            BlackjackDialog.showGiveUserCardsMsg();
            do {
                System.out.println("Dealing user's cards...");
                userCards = CardsUtils.generateRandomCards(cards, 1);
                Object[] userNewCard = CardsUtils.showUserCardsValue(userCards, userCardsValue1, userCardsValue2,
                        hasUserA);
                userCardsValue1 = (int) userNewCard[1];
                userCardsValue2 = (int) userNewCard[2];
                userMsg = (String) userNewCard[0];
                hasUserA = (boolean) userNewCard[3];

                // Check if user has Blackjack
                winner = CardsUtils.checkBlackjack(userCardsValue1, userCardsValue2, crupierCardsValue1,
                        crupierCardsValue2);
                if (winner)
                    return;

                // Show option again
                if (userCardsValue1 < 21 | userCardsValue2 < 21) {
                    var requestAnotherCard = BlackjackDialog
                            .showUserOptions(userMsg + " & " + crupierMsg);
                    if (requestAnotherCard == 1) {
                        CardsUtils.generateCrupierCards(crupierCards, crupierCardsValue1, crupierCardsValue2,
                                hasCrupierA, winner,
                                userCardsValue1, userCardsValue2, cards);
                        break;
                    }
                }
            } while (userCardsValue1 < 21 | userCardsValue2 < 21);

            // User over 21
            if (userCardsValue1 > 21 && userCardsValue2 > 21) {
                BlackjackDialog.showUserLose("You went over 21, you lose.");
            }
        }

        if (selection == 1) {
            // Generate crupier card;
            CardsUtils.generateCrupierCards(crupierCards, crupierCardsValue1, crupierCardsValue2, hasCrupierA, winner,
                    userCardsValue1, userCardsValue2, cards);
        }
    }

}