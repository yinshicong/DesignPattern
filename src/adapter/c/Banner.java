package adapter.c;

/**
 * 表示现有的程序
 *
 * Created by Administrator on 2018/5/25 0025.
 */
public class Banner {

    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen(){
        System.out.println("("+string+")");
    }

    public void showWithAster(){
        System.out.println("*"+string+"*");
    }

}
