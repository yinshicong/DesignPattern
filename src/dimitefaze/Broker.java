package dimitefaze;

/**
 * 经纪人
 *
 * Created by Administrator on 2018/7/24 0024.
 */
public class Broker {

    private Merchant merchant;

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public void reservation(){
        System.out.println("经纪人预约。");
        merchant.business();
    }
}
