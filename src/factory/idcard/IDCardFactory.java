package factory.idcard;

import factory.framework.Factory;
import factory.framework.Product;

/**
 * 具体的工厂，返回具体的产品。
 *
 * Created by Administrator on 2018/5/15 0015.
 */
public class IDCardFactory extends Factory {

    //实现创建产品的抽象方法，返回具体产品
    @Override
    protected Product createProduct(String owner) {
        return new IDCardProduct(owner);
    }

    @Override
    protected void registerProduct(Product owner) {
        System.out.println("注册"+owner.getName()+"产品");
    }

}
