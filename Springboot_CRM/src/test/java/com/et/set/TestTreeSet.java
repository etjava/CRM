package com.et.set;

import java.util.*;
public class TestTreeSet{
	public static void main(String[] args){
		HashSet<Student4> set = new HashSet<>();
		set.add(new Student4("A",12));
		set.add(new Student4("B",15));

		System.out.println(set);

		for(Student4 s:set)
			System.out.println(s);

		TreeSet<Student3> set2 = new TreeSet<>();
		set2.add(new Student3("C",15));
		set2.add(new Student3("C",16));
		System.out.println(set2.size());
	}
}

class Student3 implements Comparable<Student3> {
	String name;
	Integer age;
	public Student3(String name,int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+","+age;
	}


	@Override
	public int compareTo(Student3 o) {
		Student3 o1 = this;
		Student3 o2 = o;
		return o1.name.hashCode() - o2.name.hashCode();
	}
}

class Student4 {
	String name;
	Integer age;
	public Student4(String name,int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+","+age;
	}
}