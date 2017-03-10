package com.grouk;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //adapter pattern with extension
	    MyList<Integer> myList1 = new Adapter1<>();
        myList1.push(1);
        myList1.pop();

        //adapter pattern with composition
        MyList<Long> myList2 = new Adapter2<>(new ArrayList<>());
        myList2.push(1L);
        myList2.pop();
        myList2.pop();
    }
}
