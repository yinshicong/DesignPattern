package dimitefaze;

/**
 * Created by Administrator on 2018/7/24 0024.
 */
public class Test {
    public static void main(String[] args) {

        Merchant merchant = new Merchant("慈善");
        Broker broker = new Broker();
        broker.setMerchant(merchant);
        Star star = new Star();
        star.setBroker(broker);
        star.play();
    }
}
