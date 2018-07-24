package dimitefaze;

/**
 * 明星
 *
 * Created by Administrator on 2018/7/24 0024.
 */
public class Star {

    private Broker broker;

    public Star() {
    }

    public Star(Broker broker) {
        this.broker = broker;
    }

    public Broker getBroker() {
        return broker;
    }

    public void setBroker(Broker broker) {
        this.broker = broker;
    }

    public void play(){
        //直接和经纪人说去洽谈演出去，和谁接触我不管。
        broker.reservation();
        System.out.println("大明星去演出了。");
    }

}
