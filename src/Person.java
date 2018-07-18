import java.util.List;

/**
 * Created by Administrator on 2018/5/15 0015.
 */
public class Person implements Cloneable {

    private String name;

    private List<String> xingqu;

    private Person son;

    public Person(){};

    public Person(String name) {
        this.name = name;
    }



    public Person getSon() {
        return son;
    }

    public void setSon(Person son) {
        this.son = son;
    }

    public List<String> getXingqu() {
        return xingqu;
    }

    public void setXingqu(List<String> xingqu) {
        this.xingqu = xingqu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person get() throws CloneNotSupportedException {
        return (Person)clone();
    }

}
