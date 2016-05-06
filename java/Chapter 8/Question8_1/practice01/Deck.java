package Question8_1.practice01;

import CtCILibrary.AssortedMethods;
import Question8_4.Car;

import java.util.ArrayList;

/**
 * Created by SiyuanZeng's on 9/14/2014.
 */
// What does it mean to be a class?
// A class is an entity, and can be instantiated every where. Can be a list, or a single element.
public class Deck<T extends Card> {
    //What is this for? find the usage. This is used to distribute the card.
    private int dealtIndex;
    private ArrayList<T> cards;

    public ArrayList<T> getCards() {
        return cards;
    }

    public void setCards(ArrayList<T> cards) {
        this.cards = cards;
    }

    public Deck() {
    }

    public void shuffle() {
        for (int i = 0; i < cards.size(); i++) {
            int j = AssortedMethods.randomIntInRange(i, cards.size() - i - 1);
            T card1 = cards.get(i);
            T card2 = cards.get(j);
            cards.set(i, card2);
            cards.set(j, card1);
        }
    }

    //
    public int remainingCards() {
        return 0;
    }

    // What is the number for? Should name the parameter well.
    public T[] dealHand(int number) {
        if (remainingCards() < number) {
            return null;
        }

        //
        T[] hand = (T[]) new Card[number];
        int count = 0;
        while (count < number) {
            T card = dealCard();
            if (card != null) {
                hand[count] = card;
                count++;
            }
        }
        return hand;
    }

    // get the deal card.
    public T dealCard() {
        if (remainingCards() == 0) {
            return null;
        }
        T card = cards.get(dealtIndex);
        card.markUnavailable();
        dealtIndex++;
        return card;
    }

    public void print() {
        for (Card card : cards) {
            card.print();
        }
    }

}
