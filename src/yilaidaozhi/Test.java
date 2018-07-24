package yilaidaozhi;

import factory.framework.Product;

/**
 * Created by Administrator on 2018/7/20 0020.
 */
public class Test {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.programming(new Java());
        programmer.programming(new Python());
    }
}
