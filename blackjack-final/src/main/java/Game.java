package src.main.java;

public class Game {
    public static int BlackjackGame(int userMoney, int userBet) {
        // !TODO DIAGRAMA DE FLUJO
        // !TODO Documentación README.MD
        // !TODO Implementar apuesta y saldo

        // All BJ Cards
        String cards[] = { "A-Heart", "2-Heart", "3-Heart", "4-Heart", "5-Heart",
                "6-Heart", "7-Heart", "8-Heart",
                "9-Heart", "10-Heart", "J-Heart", "Q-Heart", "K-Heart",
                "A-Sword",
                "2-Sword", "3-Sword", "4-Sword", "5-Sword", "6-Sword", "7-Sword",
                "8-Sword", "9-Sword",
                "10-Sword", "J-Sword", "Q-Sword", "K-Sword",
                "A-Clover", "2-Clover", "3-Clover", "4-Clover", "5-Clover", "6-Clover",
                "7-Clover", "8-Clover",
                "9-Clover", "10-Clover", "J-Clover", "Q-Clover", "K-Clover",
                "A-Diamond", "2-Diamond", "3-Diamond", "4-Diamond", "5-Diamond", "6-Diamond",
                "7-Diamond", "8-Diamond",
                "9-Diamond", "10-Diamond", "J-Diamond", "Q-Diamond", "K-Diamond"
        };

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
        Object[] checkBj = CardsUtils.checkBlackjack(userCardsValue1, userCardsValue2, crupierCardsValue1,
                crupierCardsValue2,
                userMoney, userBet);
        boolean isBlackjack = (boolean) checkBj[0];
        int userMoneyWithBlackjack = (int) checkBj[1];
        if (isBlackjack)
            return userMoneyWithBlackjack;

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

                // Show option again
                if (userCardsValue1 < 21 | userCardsValue2 < 21) {
                    var requestAnotherCard = BlackjackDialog
                            .showUserOptions(userMsg + " & " + crupierMsg);
                    if (requestAnotherCard == 1) {
                        int restMoney = CardsUtils.generateCrupierCards(crupierCards, crupierCardsValue1,
                                crupierCardsValue2,
                                hasCrupierA, winner,
                                userCardsValue1, userCardsValue2, cards, userMoney, userBet);
                        userMoney = restMoney;
                        break;
                    }
                }
            } while (userCardsValue1 < 21 || userCardsValue2 < 21);

            if (userCardsValue1 >= 21 && userCardsValue2 >= 21) {
                int restMoney = CardsUtils.generateCrupierCards(crupierCards, crupierCardsValue1, crupierCardsValue2,
                        hasCrupierA, winner,
                        userCardsValue1, userCardsValue2, cards, userMoney, userBet);
                userMoney = restMoney;
            }
        }

        if (selection == 1) {
            // Generate crupier card;
            int restMoney = CardsUtils.generateCrupierCards(crupierCards, crupierCardsValue1, crupierCardsValue2,
                    hasCrupierA, winner,
                    userCardsValue1, userCardsValue2, cards, userMoney, userBet);
            userMoney = restMoney;
        }
        return userMoney;
    }
}
