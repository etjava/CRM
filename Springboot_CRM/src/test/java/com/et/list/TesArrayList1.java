package com.et.list;

import java.util.Arrays;
import java.util.List;

public class TesArrayList1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        // lambda表达式
        list.forEach(element -> {
            // 处理元素
            System.out.println(element);
        });


        // stream api
        list.stream().forEach(e -> {
            System.out.println(e);
        });
    }
}
