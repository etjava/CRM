package com.et.list;

import java.util.Iterator;
import java.util.Vector;

public class TestVector {
    public static void main(String[] args){
        Vector<Integer> list = new Vector<Integer>(23);//集合
        list.add(5);//list.add(new Integer(5));
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(4);
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.get(0));
        //如何遍历集合
        for(int i = 0 ;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("==========================");
        Iterator<Integer> car = list.iterator();
        while(car.hasNext()){
            System.out.println(car.next());
        }
		/*
			boolean char byte short int long float double
			Boolean Character Byte Short Integer Long Float Double
		*/
    }
}
