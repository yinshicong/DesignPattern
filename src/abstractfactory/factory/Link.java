package abstractfactory.factory;

/**
 * Created by Administrator on 2018/5/16 0016.
 */
public abstract class Link extends Item {

    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
