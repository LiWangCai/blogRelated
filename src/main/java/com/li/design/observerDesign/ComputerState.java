package com.li.design.observerDesign;

import java.util.ArrayList;

public class ComputerState implements Subject {
    private ArrayList<Observer> observerArrayList = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observerArrayList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerArrayList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o :
                observerArrayList) {
            o.update("有人在玩儿电脑了。。。");
        }
    }

    public void someOneUserComputer() {
        notifyObservers();
    }
}
