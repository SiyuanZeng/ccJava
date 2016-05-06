package Question8_1.practice02;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by SiyuanZeng's on 10/5/2014.
 */
public class BlackJackHand extends Hand<BlackJackCard> {
    public BlackJackHand() {
    }

    public int score() {
        ArrayList<Integer> possibleScores = possibleScore();
        int maxOfAllUnder21Values = Integer.MIN_VALUE;
        int minOfAllOver21Values = Integer.MAX_VALUE;
        for (int score: possibleScores) {
            if (score > 21 && score < minOfAllOver21Values) {
                minOfAllOver21Values = score;
            } else if (score <= 21 && score > maxOfAllUnder21Values) {
                maxOfAllUnder21Values = score;
            }
        }
        return maxOfAllUnder21Values == Integer.MIN_VALUE ? minOfAllOver21Values : maxOfAllUnder21Values;
    }


    private ArrayList<Integer> possibleScore() {
        ArrayList<Integer> possibleScores = new ArrayList<Integer>();
        if (cards.size() == 0) {
            return possibleScores;
        }

        for (BlackJackCard card : cards) {
            addCardToScoreList(card, possibleScores);
        }
        return possibleScores;
    }

    private void addCardToScoreList(BlackJackCard card, ArrayList<Integer> possibleScores) {
        if (possibleScores.size() == 0) {
            possibleScores.add(0);
        }
        int length = possibleScores.size();
        for (int i = 0; i < length; i++) {
            int score = possibleScores.get(i);
            possibleScores.set(i, score + card.minValue());
            if (card.minValue() != card.maxValue()) {
                possibleScores.add(score + card.maxValue());
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
        if (cards.size() != 2) {
            return false;
        }

        BlackJackCard first = cards.get(0);
        BlackJackCard second = cards.get(1);
        return (first.isAce() && second.isFaceCard() || (second.isAce() && first.isFaceCard()));


    }

}
