package prototype.framework;

/**
 * Created by Administrator on 2018/5/15 0015.
 */
public abstract class Product implements Cloneable {

    public abstract void user(String s);

    public  Product createClone(){
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    };

}
