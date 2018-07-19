package composite.army;

/**
 * Created by Administrator on 2018/7/18 0018.
 */
public class Soldier extends Warrior{

    public Soldier(String name) {
        super(MilitaryRank.Solider);
        this.setName(name);
    }

    @Override
    public void printList(String prefix,StringBuilder stringBuilder) {
        System.out.println(stringBuilder+prefix+this);
    }

}
