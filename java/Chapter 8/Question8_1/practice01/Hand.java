package Question8_1.practice01;

import java.util.ArrayList;

/**
 * Created by SiyuanZeng's on 9/14/2014.
 */

// Role, explain what it does.
// When reading others' code, read the description to quickly get the role of the calss.
// a person's full hand of cards.
public abstract class Hand<T extends Card> {
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
