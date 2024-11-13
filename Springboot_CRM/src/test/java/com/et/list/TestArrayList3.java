package com.et.list;

import java.util.ArrayList;
import java.util.Collections;

/** 
 * ArrayList中的remove(Object obj) 是如何找到元素的(如何删除元素)
 * @author Andy Lu
 *
 * @Email <ETJAVA@HOTMAIL.COM>
 *
 * @Time 2023年4月15日
 */
public class TestArrayList3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Integer i1 = new Integer(55);
		Integer i2 = new Integer(55);
		list.add(i1);
		System.out.println(list.size());
		list.remove(i2);
		System.out.println(list.size());//0?



		
		ArrayList<String> list2 = new ArrayList<>();
		String str1 = new String("Tom");
		String str2 = new String("Tom");
		list2.add(str1);
		System.out.println(list2.size());
		list2.remove(str2);
		System.out.println(list2.size());//0?
		// str1和str2什么东西相等？  ArrayList的remove(Object) 完全尊重equals返回的比较结果
		
		
		ArrayList<Teacher> teaList = new ArrayList<>();
		Teacher tea1 = new Teacher("Tom",18);
		Teacher tea2 = new Teacher("Tom",18);
		teaList.add(tea1);
		System.out.println(teaList.size());
		teaList.remove(tea2);// tea1.equals(tea2)
		System.out.println(teaList.size());// 1? Teacher模式使用的是Object中的equals方法
	}
}

class Teacher{
	String name;
	int age;
	public Teacher(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("这里会执行吗？");
		if(obj == null) return false;
		if(!(obj instanceof Teacher)) return false;
		if(obj==this) return true;
		Teacher t1 = this;// 参与比较的第一个老师
		Teacher t2 = (Teacher) obj;// 参与比较的第二个老师
		return t1.name.equals(t2.name) && t1.age==t2.age;
	}
	
}
