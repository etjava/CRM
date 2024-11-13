package com.et.list;

import java.lang.reflect.Method;
import java.util.List;

public class TestCollections {

    public static void main(String[] args) throws Exception{
        Class c = TestCollections.class;

        Method[] methods = c.getDeclaredMethods();
        for (Method m:methods) {
            System.out.println(m);
        }

        Method method = c.getDeclaredMethod("addAll",List.class, Integer[].class);
        System.out.println(method);
    }

    private static void addAll(List<Integer> list, Integer ... data) {

    }
}
