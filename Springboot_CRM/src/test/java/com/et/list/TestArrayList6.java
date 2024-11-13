package com.et.list;

import java.lang.reflect.Field;
import java.util.ArrayList;

// 底层扩容及trimToSize();使用
public class TestArrayList6 {
    public static void main(String[] args) throws Exception{
        /*
		 JDK7.0之前 ArrayList扩容机制都是 *3/2+1   	10  16  25  38
		 JDK7.0 老的容量+(老的容量>>1)				10 	15	22	33
		 */
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<16;i++) {
            list.add(i);
        }
        //list.trimToSize();

        Class<?> c = Class.forName("java.util.ArrayList");
        // 获取ArrayList中的elementData属性
        Field f = c.getDeclaredField("elementData");
        f.setAccessible(true);// 反射面前无私有 反射可以破封装
        Object[] data = (Object[])f.get(list);
        System.out.println(data.length);
    }
}
