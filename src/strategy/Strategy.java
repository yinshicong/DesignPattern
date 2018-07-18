package strategy;

/**
 * Created by Administrator on 2018/5/31 0031.
 */
public interface Strategy {

    //获取下一局要出的手势
    public abstract Hand nextHand();

    //上一局获胜了，接着调用study(true)，反之输了，调用study(false);
    public abstract void study(boolean win);

}
