package com.li.design.decoratorDesign;

//������Ӹ�����
public class EggNoodles extends NoodlesDecorator{
    public EggNoodles(Noodles noodles) {
        super(noodles);
    }

    @Override
    public void createABlowOfNoodles() {
        noodles.createABlowOfNoodles();
        addEgg();
    }

    private void addEgg(){         //�������һ������������
        System.out.println("��һ������");
    }
}
