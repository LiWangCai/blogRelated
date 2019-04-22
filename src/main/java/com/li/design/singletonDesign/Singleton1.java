package com.li.design.singletonDesign;

//饿汉模式
public class Singleton1 {
    private static Singleton1 singleton1 = new Singleton1();

    private Singleton1() {
    }

    public Singleton1 getSingleton1() {
        return singleton1;
    }

    public static void main(String[] args) {

    }
}
