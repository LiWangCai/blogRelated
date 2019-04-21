package com.li.design.decoratorDesign;

//�������һ������
public class HamNoodles extends NoodlesDecorator{
    public HamNoodles(Noodles noodles) {
        super(noodles);
    }

    @Override
    public void createABlowOfNoodles() {
        noodles.createABlowOfNoodles();
        addHam();
    }

    private void addHam() {      //������Ӹ�����
        System.out.println("��һ������");
    }
}
