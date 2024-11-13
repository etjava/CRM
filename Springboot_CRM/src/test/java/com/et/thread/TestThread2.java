package com.et.thread;

public class TestThread2 {
    public static void main(String[] args) {
        MyThread2 m = new MyThread2();
        Thread t = new Thread(m,"sub thread");
        t.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"----主线程------->"+i);
        }
    }
}

class MyThread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"---------子线程-------->"+i);
        }
    }
}
