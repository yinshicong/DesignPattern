package dimitefaze;

/**
 * 商家
 * Created by Administrator on 2018/7/24 0024.
 */
public class Merchant {

    private String activity;

    public Merchant(String activity) {
        this.activity = activity;
    }

    public void business(){
        System.out.println("和商家洽谈"+activity+"活动。");
    }
}
