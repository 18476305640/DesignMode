package com.zjazn.dm._3_23种设计模式._13_命令模式._命令;

import com.zjazn.dm._3_23种设计模式._13_命令模式._被调用者.TVReceiver;

public class TVOffCommand implements Command {
    //聚合TVReceiver
    TVReceiver tv;
    //构造器
    public TVOffCommand(TVReceiver tv) {
        super();
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();

    }

    @Override
    public void undo() {
        tv.on();
    }
}
