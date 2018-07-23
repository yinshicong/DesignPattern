package lishitihuanyuanze;

import java.util.Collection;
import java.util.Map;

/**
 * Created by Administrator on 2018/7/19 0019.
 */
public class Son extends Father {

    //方法参数类型
    public Collection doSomething(Map map) {
        System.out.println("子类被执行了...");
        return map.values();
    }
}
