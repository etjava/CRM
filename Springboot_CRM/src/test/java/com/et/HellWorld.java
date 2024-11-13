package com.et;

import javax.swing.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class HellWorld extends A{
    public static void main(String[] args) throws Exception{
        //JOptionPane.showMessageDialog(null,"这是一个弹窗");
//        System.out.println(10%4);
//        System.out.println(10^3);
//        System.out.println(~4);
//        System.out.println(-10>>>1);

//        List<String> list = Arrays.asList("Java", "Android", "MySQL", "Python","ORACLE","ABCDEFG");
//        Spliterator<String> splitr = list.spliterator();// 拆一半元素出来
//        Spliterator<String> st = splitr.trySplit();// 拆一半元素出来
//        splitr.forEachRemaining(System.out::println);
//        System.out.println("--穿过分离器的另一半---");
//        st.forEachRemaining(System.out::println);
//        System.out.println(2.5E3);
        A a = new A();
        //a.setName("Tom");
        Class c = A.class;
        Field name = c.getDeclaredField("name");
        name.setAccessible(true);
        System.out.println(name.get(a));
        name.set(a,"Jerry");
        System.out.println(name.get(a));

        int[] data = new int[9];
        System.out.println(data);
    }
}

class A{
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
