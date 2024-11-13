package com.et.thread;

public class TestSetDaemon{
	public static void main(String[] args){
		MyThread3 mt = new MyThread3();
		mt.setDaemon(true);//设置守护级线程
		mt.start();

		for(int i = 0;i<10000;i++){
			System.out.println(i);
		}
	}
}
class MyThread3 extends Thread{
	public void run(){
		while(true){
			System.out.println("这是守护级线程");
		}
	}
}