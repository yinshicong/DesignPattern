package yilaidaozhi;


public class Programmer {
    //高层逻辑依赖了底层的原子逻辑，此时两个类耦合了，没有任何扩展言。
    public void programming(Language java){
        java.say();
    }
}
