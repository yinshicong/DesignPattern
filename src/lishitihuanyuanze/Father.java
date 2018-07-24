package lishitihuanyuanze;

import java.util.Collection;
import java.util.HashMap;

/**
 * Created by Administrator on 2018/7/19 0019.
 */
public class Father {
    public Collection doSomething(HashMap map){
        System.out.println("父类被执行了...");
        return map.values();
    }
}
