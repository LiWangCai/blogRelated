package com.li.design.singletonDesign;

//双重检测模式
public class Singleton3 {
    private static Singleton3 singleton3;

    private Singleton3() {
    }

    public Singleton3 getSingleton3() {
        if (singleton3 == null) {
            synchronized (Singleton3.class) {
                if (singleton3 == null) {
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }
}
