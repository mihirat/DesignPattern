public class Hand {
    public static final int HAND_GU = 0;
    public static final int HAND_CH = 1;
    public static final int HAND_PA = 2;

    public static final Hand[] hands = {
            new Hand(HAND_GU),
            new Hand(HAND_CH),
            new Hand(HAND_PA)
    };
    private static final String[] names = {
            "GUU", "CHOKI", "PAA"
    };
    private int handValue;

    private Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
        return hands[handValue];
    }

    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h) {
        return fight(h) == 1;
    }

    private int fight(Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handValue + 1) % 3 == h.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        return names[handValue];
    }
}