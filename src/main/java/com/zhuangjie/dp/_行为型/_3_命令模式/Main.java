package com.zhuangjie.dp._行为型._3_命令模式;

public class Main {
    public static void main(String[] args) {
        Controller.call(new OpenCommand(new HuaweiHaltRectiver()));

    }
}
