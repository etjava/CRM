package com.et.set;

import java.util.*;
public class TestComparable{
	public static void main(String[] args){
		TreeSet<Student5> ts = new TreeSet<Student5>();
		Student5 s1 = new Student5("a",97);
		Student5 s2 = new Student5("b",65);
		Student5 s3 = new Student5("c",80);
		Student5 s4 = new Student5("d",70);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		System.out.println(ts);
	}
}

class Student5 implements Comparable<Student5>{
	String name;
	int score;
	public Student5(String name,int score){
		this.name = name;
		this.score = score;
	}
	public int compareTo(Student5 s){
		return this.score - s.score;
	}
	public String toString(){
		return name + " " + score ;
	}
}