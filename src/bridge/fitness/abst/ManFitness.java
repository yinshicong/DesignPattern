package bridge.fitness.abst;

import bridge.fitness.impl.Equipment;

/**
 * Created by Administrator on 2018/5/30 0030.
 */
public class ManFitness extends Fitness {

    public ManFitness(Equipment equipment) {
        super(equipment);
    }

    public void man(){
        System.out.println("男人健身。");
        fit();
        System.out.println("健身结束。");
    }

}
