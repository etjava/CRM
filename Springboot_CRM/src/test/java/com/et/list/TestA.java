package com.et.list;

import java.util.*;
public class TestA{
	public static void main(String[] agrs){
		List<Stu> list = new ArrayList<>();
		Collections.addAll(list,new Stu("张三",12,100),new Stu("李四",12,100),new Stu("王五",13,101));
		Collections.sort(list);
		//Collections.reverse(list);
		System.out.println(list);

	}
}

class Stu implements Comparable<Stu>{
	String name;
	int age;
	int score;
	public Stu(String name,int age,int score){
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public int compareTo(Stu o){
		if(this.age==o.age){
			return this.score-o.score;
		}else{
			return this.age - o.age;
		}
	}

	public String toString(){
		return "student=["+name+","+age+","+","+score+"]";
	}
}