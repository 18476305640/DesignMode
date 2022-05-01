package com.zjazn.dm._3_23种设计模式._13_命令模式._命令;

import com.zjazn.dm._3_23种设计模式._13_命令模式._被调用者.TVReceiver;

public class TVOnCommand implements Command {
    //聚合TVReceiver
    TVReceiver tv;
    //构造器
    public TVOnCommand(TVReceiver tv) {
        super();
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();

    }

    @Override
    public void undo() {
        tv.off();
    }
}
