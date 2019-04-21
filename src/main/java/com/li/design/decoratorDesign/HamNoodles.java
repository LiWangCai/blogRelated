package com.li.design.decoratorDesign;

//在面里加一根火腿
public class HamNoodles extends NoodlesDecorator{
    public HamNoodles(Noodles noodles) {
        super(noodles);
    }

    @Override
    public void createABlowOfNoodles() {
        noodles.createABlowOfNoodles();
        addHam();
    }

    private void addHam() {      //在面里加个火腿
        System.out.println("加一根火腿");
    }
}
