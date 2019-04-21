package com.li.design.observerDesign;

public class XiaoMingMother implements Observer {
    private Subject subject;

    public XiaoMingMother(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String string) {
        System.out.println("小明妈妈知道" + string);

    }
}
