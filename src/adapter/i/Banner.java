package adapter.i;

/**
 * 表示现在的实际情况
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
