package composite.army;

import java.util.List;

/**
 * 对于军队来说每一个人都是战士
 *
 * Created by Administrator on 2018/7/18 0018.
 */
public abstract class Warrior {

    //每个战士都有自己的头衔
    protected MilitaryRank militaryRank;

    //每个人都有姓名
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Warrior(MilitaryRank militaryRank) {
        this.militaryRank = militaryRank;
    }

    public String rank(){
        return militaryRank.name();
    }

    public MilitaryRank getMilitaryRank() {
        return militaryRank;
    }

    public void setMilitaryRank(MilitaryRank militaryRank) {
        this.militaryRank = militaryRank;
    }

    //打印出自己下属军队的结构
    public abstract void printList(String prefix,StringBuilder stringBuilder);

    @Override
    public String toString() {
        return getName();
    }
}
