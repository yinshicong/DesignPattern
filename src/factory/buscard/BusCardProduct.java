package factory.buscard;

import factory.framework.Product;

/**
 * Created by Administrator on 2018/5/17 0017.
 */
public class BusCardProduct extends Product {

    public BusCardProduct(String name) {
        super(name);
    }

    @Override
    public void user() {
        System.out.println("使用了公交卡");
    }

}
