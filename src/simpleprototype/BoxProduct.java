package simpleprototype;

/**
 * Created by Administrator on 2018/5/17 0017.
 */
public class BoxProduct extends Prototype {


    public static void main(String[] args) {

        Prototype prototype = new BoxProduct();
        Prototype p1 = prototype.clone();


    }

    @Override
    public Prototype clone() {
        return new BoxProduct();
    }
}
