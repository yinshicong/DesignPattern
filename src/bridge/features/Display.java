package bridge.features;

import bridge.impl.DisplayImpl;

/**
 * 类的功能层次结构-负责"显示”的类
 *
 * 该类位于类的功能层次层次最上层
 *
 * Created by Administrator on 2018/5/29 0029.
 */
public class Display {

    //在impl字段中保存了Display类的具体实现，以供后面的处理使用（impl字段既是类的两个层次结构的 桥梁）。
    private DisplayImpl impl;

    public Display(DisplayImpl display) {
        this.impl = display;
    }

    public void open(){
        impl.rawOpen();
    }

    public void print(){
        impl.rawPrint();
    }

    public void close(){
        impl.rawClose();
    }

    public final void display(){
        //三个方法最后调用了impl的方法，这样display的接口就被转换成了DisplayImpl的接口。
        open();
        print();
        close();
    }

}
