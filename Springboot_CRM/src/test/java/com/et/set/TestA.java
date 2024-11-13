package com.et.set;

import java.util.*;
public class TestA{
	public static void main(String[] agrs){
		List<Stu> list = new ArrayList<>();
		Collections.addAll(list,new Stu("张三",18,100),new Stu("李四",18,120),new Stu("王五",21,101));
		//Collections.sort(list);// 正序
		//Collections.reverse(list);// 倒叙
		//System.out.println(list);

		Collections.sort(list, new Comparator<Stu>() {
			@Override
			public int compare(Stu s1, Stu s2) {
				if(s1.age==s2.age){
					return s1.score - s2.score;
				}
				return s1.age - s2.age;
			}
		});
		System.out.println(list);
		Collections.sort(list,(s1,s2) -> {
			if(s1.age==s2.age){
				return s1.score - s2.score;
			}
			return s1.age - s2.age;
		});
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