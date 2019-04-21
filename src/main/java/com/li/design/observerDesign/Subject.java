package com.li.design.observerDesign;

//主题接口类
public interface Subject {
    void registerObserver(Observer observer); //将观察者注册到主题类中
    void removeObserver(Observer observer);   //移除观察者
    void notifyObservers();                   //通知所有的观察者
}
