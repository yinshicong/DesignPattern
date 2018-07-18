package composite.army;

import java.util.List;

/**
 * Created by Administrator on 2018/7/18 0018.
 */
public abstract class Warrior {

    protected MilitaryRank militaryRank;

    protected int size;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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

    public abstract void printList(String prefix,StringBuilder stringBuilder);

    @Override
    public String toString() {
        return getName();
    }
}
