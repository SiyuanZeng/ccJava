package Question8_1.practice02;

import java.util.ArrayList;

/**
 * Created by SiyuanZeng's on 10/11/2014.
 */
public class Question {
    public static void main(String[] args) {
        int numHands = 5;
        BlackJackGameAutomator automator = new BlackJackGameAutomator();
        automator.initializeDeck();
        boolean sucess = automator.dealInitial();
        if (!sucess) {
            System.out.println("Error. Out of cards.");
        } else {
            System.out.println("--Initial--");
            automator.printHandsAndScore();
            ArrayList<Integer> blackjacks = automator.getBlackJacks();
            if (blackjacks.size() > 0) {
                System.out.println("Blackjack at");
                for (int blackjack : blackjacks) {
                    System.out.println(blackjack + ", ");
                }
                System.out.println("");
            } else {
                boolean success = automator.playAllHands();
                if (!success) {
                    System.out.println("Error. Out of cards.");
                } else {
                    System.out.println("\n-- Completed Game --");
                    automator.printHandsAndScore();
                    ArrayList<Integer> winners = automator.getWinners();
                    if (winners.size() > 0) {
                        System.out.println("Winners: ");
                        for (Integer winner : winners) {
                            System.out.printf(winner + ", ");
                        }
                        System.out.println(" ");
                    } else {
                        System.out.println("Draw. All players have busted");
                    }
                }
            }
        }
    }
}
