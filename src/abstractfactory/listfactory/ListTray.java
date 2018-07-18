package abstractfactory.listfactory;

import abstractfactory.factory.Item;
import abstractfactory.factory.Tray;

import java.util.Iterator;

/**
 * Created by Administrator on 2018/5/16 0016.
 */
public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<li>");
        stringBuilder.append(caption);
        stringBuilder.append("<ul>");
        Iterator iterator = tray.iterator();
        while(iterator.hasNext()){
            Item item = (Item)iterator.next();
            stringBuilder.append(item.makeHtml());
        }
        stringBuilder.append("</ul>");
        stringBuilder.append("</li>");
        return stringBuilder.toString();
    }
}
