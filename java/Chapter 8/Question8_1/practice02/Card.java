package Question8_1.practice02;

/**
 * Created by SiyuanZeng's on 10/1/2014.
 */
public abstract class Card {
    private boolean available = true;

    protected int faceValue;
    protected Suit suit;

    protected Card(int faceValue, Suit suit) {
        this.faceValue = faceValue;
        this.suit = suit;
    }

    public abstract int value();

    public Suit suit() {
        return suit;
    }

    public boolean isAvailable() {
        return available;
    }

    public void markUnavailable() {
        available = false;
    }

    public void markeAvailable() {
        available = true;
    }

    public void print() {
        String[] faceValues = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        System.out.println(faceValues[faceValue - 1]);
        switch (suit) {
            case Club:
                System.out.println("c");
                break;
            case Heart:
                System.out.println("h");
                break;
            case Diamond:
                System.out.println("d");
                break;
            case Spade:
                System.out.println("s");
                break;
        }
        System.out.println(" ");
    }

}
