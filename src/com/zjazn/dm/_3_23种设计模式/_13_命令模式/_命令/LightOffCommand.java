package com.zjazn.dm._3_23种设计模式._13_命令模式._命令;

import com.zjazn.dm._3_23种设计模式._13_命令模式._被调用者.LightReceiver;

public class LightOffCommand implements Command {
    //聚合LightReceiver
    LightReceiver light;
    //构造器
    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }
    @Override
    public void execute() {
        //调用接收者的方法
        light.off();
    }

    @Override
    public void undo() {
        //调用接收者的方法
        light.on();

    }
}
