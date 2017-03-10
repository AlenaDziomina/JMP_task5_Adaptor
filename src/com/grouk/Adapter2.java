package com.grouk;

import java.util.List;

/**
 * Created by Alena on 10.03.2017.
 */
public class Adapter2<T> implements MyList<T> {
    private List<T> list;

    public Adapter2(List<T> list) {
        this.list = list;
    }

    @Override
    public void push(T object) {
        System.out.println("Push2");
        list.add(object);
    }

    @Override
    public T pop() {
        System.out.println("Pop2");
        if (list.size() >0 ) {
            return list.remove(list.size() - 1);
        } else {
            return null;
        }
    }
}
