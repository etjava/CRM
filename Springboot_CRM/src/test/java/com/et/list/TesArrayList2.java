package com.et.list;

import java.util.*;

public class TesArrayList2 {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"A", "B", "C","D","E","F");
        // 1st. for + i
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("=================================");
        // 2nd. foreach
        for (String s:list) {
            System.out.println(s);
        }
        System.out.println("=================================");
        // 3rd. Iterator
        Iterator<String> car = list.iterator();
        while(car.hasNext()){// 测试还有没有下一个元素
            String s = car.next();// 得到下一个元素
            System.out.println(s);
        }
    }
}
