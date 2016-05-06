package Question8_1;

import java.util.ArrayList;

public class Question {


    public static void main(String[] args) {
        int numHands = 5;

        BlackJackGameAutomator automator = new BlackJackGameAutomator(numHands);
        automator.initializeDeck();
        boolean success = automator.dealInitial();
        if (!success) {
            System.out.println("Error. Out of cards.");
        } else continueAfterDealingInitial(automator);
    }

    private static void continueAfterDealingInitial(BlackJackGameAutomator automator) {
        System.out.println("-- Initial --");
        automator.printHandsAndScore();
        getBlack(automator);
    }

    private static void getBlack(BlackJackGameAutomator automator) {
        ArrayList<Integer> blackjacks = automator.getBlackJacks();
        if (blackjacks.size() > 0) {
            System.out.print("Blackjack at ");
            for (int i : blackjacks) {
                System.out.print(i + ", ");
            }
            System.out.println("");
        } else playAllHands(automator);
    }

    private static void playAllHands(BlackJackGameAutomator automator) {
        boolean success;
        success = automator.playAllHands();
        if (!success) {
            System.out.println("Error. Out of cards.");
        } else getWinners(automator);
    }

    private static void getWinners(BlackJackGameAutomator automator) {
        System.out.println("\n-- Completed Game --");
        automator.printHandsAndScore();
        ArrayList<Integer> winners = automator.getWinners();
        if (winners.size() > 0) {
            System.out.print("Winners: ");
            for (int i : winners) {
                System.out.print(i + ", ");
            }
            System.out.println("");
        } else {
            System.out.println("Draw. All players have busted.");
        }
    }
}
