package Question8_1.practice01;

/**
 * Created by SiyuanZeng's on 9/14/2014.
 */
public class BlackJackGameAutomator {
    private Deck<BlackJackCard> deck;
    private BlackJackHand[] hands;
    private int HIT_UNTIL = 16;

    public BlackJackGameAutomator(int numPlayers) {
        hands = new BlackJackHand[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            hands[i] = new BlackJackHand();
        }
    }

    public boolean dealInitial() {
        return false;
    }

    public boolean playHand(int i) {
        return false;
    }

    public boolean playHand(BlackJackHand hand) {
        while (hand.score() < HIT_UNTIL) {
            BlackJackCard card = deck.dealCard();// why black jack card? It is an extension.
            if (card == null) {
                return false;
            }
            hand.addCard(card);
        }
        return true;
    }

    public boolean playAllHands() {
        return false;
    }

    public void initializeDeck() {
    }

    public void printHandsAndScore() {
    }

    public java.util.ArrayList<Integer> getWinners() {
        return null;
    }

    public java.util.ArrayList<Integer> getBlackJacks() {
        return null;
    }
}
