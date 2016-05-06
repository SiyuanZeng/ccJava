package Question8_1.practice02;

import java.util.ArrayList;

/**
 * Created by SiyuanZeng's on 10/5/2014.
 */
public class Hand <T extends Card> {
    protected ArrayList<T> cards = new ArrayList<T>();

    public int score() {
        int score = 0;
        for (T card : cards) {
            score += card.value();
        }
        return score;
    }

    public void addCard(T card) {
        cards.add(card);
    }

    public void print() {
        for (Card card : cards) {
            card.print();
        }
    }

}
