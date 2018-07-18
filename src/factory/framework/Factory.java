package factory.framework;

/**
 * 抽象工厂
 *
 * Created by Administrator on 2018/5/15 0015.
 */
public abstract class Factory {

    public final Product create(String owner){
        Product p =createProduct(owner);
        registerProduct(p);
        return p;
    }

    //创建抽象产品的抽象方法，同一返回抽象产品，由具体的抽象工厂实现
    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product owner);

}
