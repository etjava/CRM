package com.et.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// 测试删除元素
public class TesArrayList3 {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"A", "B", "C","D","E","F");
        // 1st. for + i
        for (int i = 0; i < list.size(); i++) {
            list.remove("D");
        }
        System.out.println(list);
        System.out.println("========================");
        for(String s:list){
            if(s.equals("B")){
               // list.remove("B");// ConcurrentModificationException
            }
        }
        System.out.println(list);
        System.out.println("========================");

        Iterator<String> car = list.iterator();
        while(car.hasNext()){
            if(car.next().equals("B")){
               // list.remove("B"); // ConcurrentModificationException
                car.remove();
            }
        }
        System.out.println(list);
        System.out.println("========================");
    }
}
