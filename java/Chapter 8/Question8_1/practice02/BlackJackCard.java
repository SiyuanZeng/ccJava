package Question8_1.practice02;

/**
 * Created by SiyuanZeng's on 10/1/2014.
 */
public class BlackJackCard extends Card {
    public BlackJackCard(int c, Suit s) {
        super(c, s);
    }

    public int value() {
        if (isAce()) {
            return 1;
        } else {
            return value();
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
        return faceValue == 1;
    }

    public boolean isFaceCard() {
        return faceValue >= 11 && faceValue <= 13;
    }

}
