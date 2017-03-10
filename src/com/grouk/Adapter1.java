package com.grouk;

import java.util.LinkedList;

/**
 * Created by Alena on 10.03.2017.
 */
public class Adapter1<T> extends LinkedList<T> implements MyList<T> {
    @Override
    public T pop() {
        System.out.println("Pop1");
        return super.pop();
    }

    @Override
    public void push(T t) {
        System.out.println("Push1");
        super.push(t);
    }
}
