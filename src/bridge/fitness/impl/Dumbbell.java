package bridge.fitness.impl;

/**
 * Created by Administrator on 2018/5/30 0030.
 */
public class Dumbbell implements Equipment {
    @Override
    public void work() {
        System.out.println("锻炼了双臂。");
    }

    @Override
    public void user() {
        System.out.println("使用了哑铃。");
    }
}
