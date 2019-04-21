package com.li.design.observerDesign;

public class XiaoMingFather implements Observer {
    private Subject subject;

    public XiaoMingFather(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String string) {
        System.out.println("小明爸爸知道" + string);
    }
}
