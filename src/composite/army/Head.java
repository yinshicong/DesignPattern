package composite.army;

import java.util.ArrayList;
import java.util.List;

/**
 * 团长
 *
 * Created by Administrator on 2018/7/18 0018.
 */
public class Head extends Warrior{

    //团长手下的战士
    private List<Warrior> warriors = new ArrayList<>();

    public Head() {
        super(MilitaryRank.Head);
    }

    public List<Warrior> getWarriors() {
        return warriors;
    }

    public void setWarriors(List<Warrior> warriors) {
        this.warriors = warriors;
    }

    @Override
    public void printList(String prefix,StringBuilder stringBuilder) {
        StringBuilder that = new StringBuilder(stringBuilder);
        stringBuilder.append("  ");
        warriors.forEach(warrior -> {
            System.out.println(that.toString()+prefix+warrior.rank()+warrior.getName());
        });
    }

}
