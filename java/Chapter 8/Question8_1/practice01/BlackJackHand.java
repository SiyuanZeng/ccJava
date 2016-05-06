package Question8_1.practice01;

import java.util.ArrayList;

/**
 * Created by SiyuanZeng's on 9/14/2014.
 */

// Role, search usage
//
public class BlackJackHand extends Hand<BlackJackCard> {
    // Why does the <BlackJackCard> will help resolve this line? BlackJackCard first = cards.get(0);
    // protected ArrayList<T> cards = new ArrayList<T>();
    // Because the Hand has the cards. once put the BlackJackCard, then they will be in the same type.
    

    private boolean blackJack;

    public BlackJackHand() {
    }

    // To read the code, understand the role of the methods
    // Refactor
    // Inside the method, read the variables, trace the origin and make the the variable more sense.
    // To write the code, parameter name should reflect the origin of the vlaues.
    // What is the method used for?
    public int score() {
        ArrayList<Integer> possibleScores = possibleScores();
        // How to use these 2 variable?
        int maxUnder21 = Integer.MIN_VALUE;
        int minOver21 = Integer.MAX_VALUE;
        for (int posScore : possibleScores) {
            if (posScore > 21 && posScore < minOver21) {
                minOver21 = posScore;
            } else if (posScore <= 21 && posScore > maxUnder21) {
                maxUnder21 = posScore;
            }
        }
        return maxUnder21 == Integer.MIN_VALUE ? minOver21 : maxUnder21;
    }

    public ArrayList<Integer> possibleScores() {
        ArrayList<Integer> scores = new ArrayList<Integer>();
        if (cards.size() == 0) {
            return scores;
        }
        for (BlackJackCard card : cards) {
            addCardToScoreList(card, scores);
        }

        return scores;
    }

    private void addCardToScoreList(BlackJackCard card, ArrayList<Integer> scores) {
        // why?
        if (scores.size() == 0) {
            scores.add(0);
        }

        int length = scores.size();
        for (int i = 0; i < length; i++) {
            int score = scores.get(i);
            scores.set(i, score + card.minValue());
            if (card.minValue() != card.maxValue()) {
                scores.add(score + card.maxValue());
            }
        }
    }

    public boolean busted() {
        return score() > 21;
    }

    public boolean is21() {
        return score() == 21;
    }

    public boolean isBlackJack() {
        // 2 cards
        if (cards.size() != 2) {
            return false;
        }

        // Check value
        BlackJackCard first = cards.get(0);
        BlackJackCard second = cards.get(1);
        return (first.isAce() && second.isFaceCard() || second.isAce() && first.isFaceCard() );
    }
}
