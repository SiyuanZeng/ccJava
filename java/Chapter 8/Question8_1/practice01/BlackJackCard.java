package Question8_1.practice01;

/**
 * Created by SiyuanZeng's on 9/14/2014.
 */
public class BlackJackCard extends Card {
    // Extension: know the differences. Collapse everything, then you can easily see what is the inside.
    // value
    // Ace
    public BlackJackCard(int faceValue, Suit suit) {
        super(faceValue, suit);
    }

    public int value() {
        if (isAce()) {
            return 1;
        } else if (getFaceValue() >= 11 && getFaceValue() <= 13) {
            return 10;
        } else {
            return getFaceValue();
        }
    }

    public int minValue() {
        if (isAce()) {
            return 1;
        } else {
            return value();
        }
    }

    public int maxValue() {
        if (isAce()) {
            return 11;
        } else {
            return value();
        }
    }

    public boolean isAce() {
        return getFaceValue() == 1;
    }

    public boolean isFaceCard() {
        return getFaceValue() >= 11 && getFaceValue() <= 13;
    }
}
