package com.li.design.decoratorDesign;

//在面里加个鸡蛋
public class EggNoodles extends NoodlesDecorator{
    public EggNoodles(Noodles noodles) {
        super(noodles);
    }

    @Override
    public void createABlowOfNoodles() {
        noodles.createABlowOfNoodles();
        addEgg();
    }

    private void addEgg(){         //在面里加一个鸡蛋。。。
        System.out.println("加一个鸡蛋");
    }
}
