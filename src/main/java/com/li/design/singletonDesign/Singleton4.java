package com.li.design.singletonDesign;

//
public class Singleton4 {
    private Singleton4() {
    }

    private static class SingletonHandler {
        private static Singleton4 singleton4 = new Singleton4();
    }

    public Singleton4 getSingleton4() {
        return SingletonHandler.singleton4;
    }
}
