package composite.army;

/**
 * 士兵
 *
 * Created by Administrator on 2018/7/18 0018.
 */
public class Soldier extends Warrior{

    //士兵只有自己一个人，他手下就没有战士了

    public Soldier(String name) {
        super(MilitaryRank.Solider);
        this.setName(name);
    }

    //只能打印出自己
    @Override
    public void printList(String prefix,StringBuilder stringBuilder) {
        System.out.println(stringBuilder+prefix+this);
    }

}
