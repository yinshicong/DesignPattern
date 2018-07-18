package prototype.startwar;

/**
 * Created by Administrator on 2018/5/25 0025.
 */
public class WhiteSoldier {

    public synchronized WhiteSoldier create() throws CloneNotSupportedException {
        try {
            return (WhiteSoldier)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void war(){
        System.out.println("打仗去了。。");
    }

}
