package poo.piolig.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Truck <T> implements Iterable <T> {

    private List<T> objects;
    // maximum of objects
    private int max;

    public Truck(int max) {
        this.max = max;
        this.objects = new ArrayList();
    }


    public void add(T object){
        if (this.objects.size() <= max) {
            this.objects.add(object);
        } else {
            throw new RuntimeException("No more room available");
        }
    }


    @Override
    public Iterator <T> iterator() {
        return this.objects.iterator();
    }
}
