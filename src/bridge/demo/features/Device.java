package bridge.demo.features;

import bridge.demo.impl.System;

/**
 * 设备-对象最高层级
 *
 * Created by Administrator on 2018/5/30 0030.
 */
public class Device {

    //系统
    private System product;

    protected Device(System product) {
        this.product = product;
    }

    private void email(){
        product.email();
    }

    private void internet(){
        product.internet();
    }

    private void phone(){
        product.phone();
    }

    public final void user(){
        email();
        internet();
        phone();
    }

}
