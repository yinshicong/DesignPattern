package factory.framework;

/**
 * 抽象产品
 *
 * Created by Administrator on 2018/5/15 0015.
 */
public abstract class Product {

    public abstract void user();

    private String name;

    public Product(String name) {
        this.name = name;
        System.out.println("创建"+name+"产品");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
