package prototype.framework;

import java.util.HashMap;

/**
 * Created by Administrator on 2018/5/15 0015.
 */
public class Manage {

    private HashMap<String,Product> showcase = new HashMap<>();

    public void register(String name,Product proto){
        showcase.put(name,proto);
    }

    public Product create(String name){
        Product product = showcase.get(name);
        return product.createClone();
    }

}
