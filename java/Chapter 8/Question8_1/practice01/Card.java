package Question8_1.practice01;

/**
 * Created by SiyuanZeng's on 9/13/2014.
 */
public abstract class Card {
    private Suit suit;
    private boolean available = true;
    private int faceValue;

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public Card(int faceValue, Suit suit) {
        this.faceValue = faceValue;
        this.suit = suit;
    }

    public abstract int value() ;

    public Suit suit() {
        return suit;
    }

    public void markUnavailable() {
        available = false;
    }

    public void markAvailable() {
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
