package com.et.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// 测试删除元素
public class TesArrayList4 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Student> stuList = new ArrayList<>();
        Student tea1 = new Student("Tom",18);
        Student tea2 = new Student("Tom",18);
        stuList.add(tea1);
        System.out.println(stuList.size());
        stuList.remove(tea2);// tea1.equals(tea2)
        System.out.println(stuList.size());// 1? Teacher模式使用的是Object中的equals方法
    }
}

class Student{
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("这里会执行吗？");
        if(obj == null) return false;
        if(!(obj instanceof Teacher)) return false;
        if(obj==this) return true;
        Student t1 = this;// 参与比较的第一个老师
        Student t2 = (Student) obj;// 参与比较的第二个老师
        return t1.name.equals(t2.name) && t1.age==t2.age;
    }

    @Override
    public int hashCode() {
        return (int)Math.random()*1024;
    }
}


