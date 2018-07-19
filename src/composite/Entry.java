package composite;

/**
 * Created by Administrator on 2018/7/18 0018.
 */
public abstract class Entry {

    protected String name;

    protected int size;


    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException("未实现add方法");
    }

    public void printList(){
        printList("");
    }

    protected abstract void printList(String prefix);

    public String toString(){
        return getName()+" (" + getSize() +")";
    }

}
