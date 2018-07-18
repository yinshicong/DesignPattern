package strategy;

/**
 * Created by Administrator on 2018/5/31 0031.
 */
public class Hand {

    private static final int GUU = 0;
    private static final int CHO= 1;
    private static final int PAA = 2;

    public static final Hand[] hands = {
            new Hand(Hand.GUU),
            new Hand(Hand.CHO),
            new Hand(Hand.PAA),
    };

    private int handValue;

    private static final String[] name = {
            "石头","剪刀","布"
    };

    public Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue){
        return new Hand(handValue);
    }

    public boolean isStrongerThan(Hand h){
        return fight(h) == 1;
    }

    private int fight(Hand h){
        if(this == h){
            return 0;
        }else if((this.handValue+1) %3 == h.handValue){
            return 1;
        }else {
            return -1;
        }
    }

    @Override
    public String toString(){
        return name[handValue];
    }

}
