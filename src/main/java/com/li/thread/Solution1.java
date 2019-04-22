package com.li.thread;

//两个线程交替打印1-100
public class Solution1 {

    private static final Object lock = new Object();
    private volatile int index = 1;

    private volatile boolean aHasPrint = false;

    class A implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                synchronized (lock) {
                    while (aHasPrint) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("A:" + index);
                    index++;
                    aHasPrint = true;
                    lock.notifyAll();
                }
            }
        }
    }

    class B implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                synchronized (lock) {
                    while (!aHasPrint) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("B:" + index);
                    index++;
                    aHasPrint = false;
                    lock.notifyAll();
                }
            }
        }
    }



    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        Thread threadA = new Thread(solution1.new A());
        Thread threadB = new Thread(solution1.new B());
        threadA.start();
        threadB.start();
    }
}
