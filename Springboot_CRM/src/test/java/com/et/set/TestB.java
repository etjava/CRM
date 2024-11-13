package com.et.set;

import java.util.*;
public class TestB{
	public static void main(String[] args){
		List<String> list = new ArrayList<>();
		Collections.addAll(list,"a","aba","aaaaaaaaa","abcd");
		Collections.sort(list,new Comparator<String>(){
			public int compare(String o1,String o2){
				if(o1.length()!=o2.length()){
					return o1.length()-o2.length();
				}
				return o1.compareTo(o2);
			}
		});
		System.out.println(list);
	}
}

class MyComparator implements Comparator<String>{
	public int compare(String o1,String o2){
		if(o1.length()!=o2.length()){
			return o1.length()-o2.length();
		}
		return o1.compareTo(o2);
	}
}