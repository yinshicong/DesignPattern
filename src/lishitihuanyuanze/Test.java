package lishitihuanyuanze;

import java.util.HashMap;

/**
 * Created by Administrator on 2018/7/19 0019.
 */
public class Test {
    public static void main(String[] args) {

        Father s = new Father();
        HashMap map = new HashMap();
        s.doSomething(map);

        Son s1 = new Son();
        HashMap map1 = new HashMap();
        s1.doSomething(map1);


        System.out.println(map.values());
    }
}
