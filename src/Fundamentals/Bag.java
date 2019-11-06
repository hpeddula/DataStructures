package Fundamentals;

import java.util.ArrayList;
import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {
    private ArrayList<Item> elements;
    public Bag(){
        elements = new ArrayList<Item>();
    }
    public void add(Item item) {
        elements.add(item);
    }
    public int size() {
        return elements.size();
    }
    public Iterator iterator() { return new BagIterator();}
    private class BagIterator implements Iterator<Item>
    {
        int i =0;
        Item num;
        @Override
        public boolean hasNext() {
            return elements.size() != 0;
        }
        @Override
        public Item next() {
            i = elements.size();
            if (i > 0) {
                num = elements.get(i - 1);
                elements.remove(i - 1);
                return num;
            }
            else
                return null;
        }
    }
}
