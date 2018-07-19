package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2018/7/18 0018.
 */
public class Directory extends Entry {

    private List<Entry> directories = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public Entry add(Entry entry) {
        directories.add(entry);
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<Entry> entryIterator = directories.iterator();
        while(entryIterator.hasNext()){
            Entry entry = entryIterator.next();
            size += entry.getSize();
        }
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix+"/"+this);
        Iterator<Entry> entryIterator = directories.iterator();
        while(entryIterator.hasNext()){
            Entry entry = entryIterator.next();
            entry.printList(prefix+"/"+name);
        }
    }

}
