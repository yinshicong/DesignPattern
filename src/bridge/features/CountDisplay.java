package bridge.features;

import bridge.impl.DisplayImpl;

/**
 * 类的功能层次结构
 *
 * Created by Administrator on 2018/5/29 0029.
 */
public class CountDisplay extends Display{


    public CountDisplay(DisplayImpl display) {
        super(display);
    }

    //
    public void multiDisplay(int times){
        open();
        for (int i = 0 ; i < times ; i++){
            print();
        }
        close();
    }


}
