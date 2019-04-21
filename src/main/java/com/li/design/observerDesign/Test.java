package com.li.design.observerDesign;

public class Test {
    public static void main(String[] args) {
        ComputerState computerState = new ComputerState();
        XiaoMingMother mother = new XiaoMingMother(computerState);
        XiaoMingFather father = new XiaoMingFather(computerState);
        XiaoMing xiaoMing = new XiaoMing(computerState);
        xiaoMing.playGame();
    }
}
