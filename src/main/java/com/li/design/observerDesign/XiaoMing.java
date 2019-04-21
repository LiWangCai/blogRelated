package com.li.design.observerDesign;

public class XiaoMing {
    ComputerState computerState;

    public XiaoMing(ComputerState computerState) {
        this.computerState = computerState;
    }

    public void playGame(){
        computerState.someOneUserComputer();
    }
}
