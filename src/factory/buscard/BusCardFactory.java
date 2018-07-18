package factory.buscard;

import factory.framework.Factory;
import factory.framework.Product;

/**
 * Created by Administrator on 2018/5/17 0017.
 */
public class BusCardFactory extends Factory {

    @Override
    protected Product createProduct(String owner) {
        return new BusCardProduct(owner);
    }

    @Override
    protected void registerProduct(Product owner) {
        System.out.println("注册了公交卡");
    }

}
