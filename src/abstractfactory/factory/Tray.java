package abstractfactory.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/5/16 0016.
 */
public abstract class Tray extends Item {

    protected List<Item> tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item){
        tray.add(item);
    }

}
