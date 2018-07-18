package bridge.features;

import bridge.impl.DisplayImpl;

import java.util.Random;

/**
 * Created by Administrator on 2018/5/29 0029.
 */
public class RandomDisplay extends Display {

    public RandomDisplay(DisplayImpl display) {
        super(display);
    }

    //添加功能
    public void timeDisplay(int time){
        Random random = new Random(time);
        int n = random.nextInt();
        open();
        for (int i = 0 ; i < n; i ++){
            print();
        }
        close();
    }

}
