package com.et.list;

import java.util.ArrayList;

// 构造方法传参问题
public class TestArrayList5 {
    public static void main(String[] args) {
        Object o = new Object();
        ArrayList<Object> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        list.ensureCapacity(10000000);// 二次手动调整底层存储空间大小
        for (int i = 0; i < 10000000; i++) {
            list.add(o);
        }
        long end = System.currentTimeMillis();
        System.out.println((end-start)+"ms");// 138ms

        ArrayList<Object> list2 = new ArrayList<>(10000000);
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            list2.add(o);
        }
        long end2 = System.currentTimeMillis();
        System.out.println((end2-start2)+"ms");// 28ms

    }
}
