package com.et.set;

import java.util.*;
public class TestTreeSet4{
	public static void main(String[] args){
	/**
		Comparable 和 Comparator 同时实现时，则以Comparator为主
		
	*/
		StudentHigh sh = new StudentHigh();
		TreeSet<Student> ts = new TreeSet<Student>(sh);// 可以传入外部比较器作为参数
		Student s1 = new Student("asd",97,165);
		Student s2 = new Student("zxc",65,190);
		Student s3 = new Student("qwe",80,180);
		Student s4 = new Student("qaz",70,170);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		System.out.println(ts);
	}
}
// 自定义外部比较器
class StudentHigh implements Comparator<Student>{
	public int compare(Student s1,Student s2){
		return s2.score - s1.score;// 倒叙
	}
}
class Student implements Comparable<Student>{
	String name;
	int score;
	int length;
	public Student(String name,int score,int length){
		this.name = name;
		this.score = score;
		this.length = length;
	}
	public int compareTo(Student s){
		Student s1 = this;
		Student s2 = s;
		return s1.score - s2.score;// 正序
	}
	public String toString(){
		return name + " " + score + " " + length;
	}
}