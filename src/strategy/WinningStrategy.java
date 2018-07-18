package strategy;

import java.util.Random;

/**
 * Created by Administrator on 2018/5/31 0031.
 */
public class WinningStrategy implements Strategy {

    private Random random;

    private boolean won = false;

    private Hand prevHand;

    public WinningStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand(){
        if(!won){
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }


}
