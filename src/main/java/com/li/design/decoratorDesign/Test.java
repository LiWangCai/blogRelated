package com.li.design.decoratorDesign;

public class Test {
    public static void main(String[] args) {
        Noodles noodles = new EggNoodles(new HamNoodles(new InstanceNoodles()));//制作一碗加蛋，加肠的面
        noodles.createABlowOfNoodles();

    }
}
