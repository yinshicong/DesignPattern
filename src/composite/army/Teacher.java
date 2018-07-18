package composite.army;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/7/18 0018.
 */
public class Teacher extends Warrior {

    private List<Warrior> warriors = new ArrayList<>();

    public Teacher() {

        super(MilitaryRank.Teacher);
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
            System.out.println(that.toString()+prefix+warrior.rank());
            warrior.printList(prefix,stringBuilder);
        });
    }

}
