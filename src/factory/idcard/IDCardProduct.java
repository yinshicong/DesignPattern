package factory.idcard;

import factory.framework.Product;

/**
 * 具体的抽象产品
 *
 * Created by Administrator on 2018/5/15 0015.
 */
public class IDCardProduct extends Product{

    IDCardProduct(String name) {
        super(name);
    }

    @Override
    public void user() {
        System.out.println("用了"+getName()+"的身份证");
    }

}
