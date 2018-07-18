package bridge.fitness.abst;

import bridge.fitness.impl.Equipment;

/**
 * 功能
 *
 * Created by Administrator on 2018/5/30 0030.
 */
public class Fitness {

    private Equipment equipment;

    public Fitness(Equipment equipment) {
        this.equipment = equipment;
    }

    //锻炼了身体
    private void work(){
        equipment.work();
    }

    //使用器材
    private void user(){
        equipment.user();
    }

    //健身
    public final void fit(){
        user();
        work();
    }

}
