package com.li.design.decoratorDesign;

public abstract class NoodlesDecorator implements Noodles {
    protected Noodles noodles;   //持有一个Noodles的引用,为被装饰的对象

    public NoodlesDecorator(Noodles noodles) {  //传入被装饰的对象
        this.noodles = noodles;
    }

    @Override
    public void createABlowOfNoodles() {
        noodles.createABlowOfNoodles();
    }
}
