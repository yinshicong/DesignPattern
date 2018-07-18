package abstractfactory.factory;

/**
 * Created by Administrator on 2018/5/16 0016.
 */
public abstract class Item {

    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHtml();

}
