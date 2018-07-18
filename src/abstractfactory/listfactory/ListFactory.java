package abstractfactory.listfactory;

import abstractfactory.factory.Factory;
import abstractfactory.factory.Link;
import abstractfactory.factory.Page;
import abstractfactory.factory.Tray;

/**
 * Created by Administrator on 2018/5/16 0016.
 */
public class ListFactory extends Factory {

    public Link createLink(String caption, String url){
        return new ListLink(caption,url);
    }

    public Tray createTray(String caption){
        return new ListTray(caption);
    }


    public Page createPage(String title, String author){
        return new ListPage(title,author);
    }

}
