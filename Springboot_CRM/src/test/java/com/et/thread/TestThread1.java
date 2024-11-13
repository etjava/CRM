package com.et.thread;

public class TestThread1 {
    public static void main(String[] args) {

        MyThread mt = new MyThread();
        //启动线程 必须使用start方法 如果调用run方法则会当作普通方法调用
        mt.start();
        // 一旦启动了子线程 我们的程序中会创建一个新的执行栈 开始执行代码
        // 此时我们的程序中是有两个执行栈交替执行
        for (int i = 0; i < 1000; i++) {
            System.out.println("这是主线程===================> Hello");
        }
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("这是一个子线程-----> world");
        }
    }
}