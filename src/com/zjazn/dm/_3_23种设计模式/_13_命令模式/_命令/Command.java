package com.zjazn.dm._3_23种设计模式._13_命令模式._命令;
//创建命令接口
public interface Command {
    //执行动作（操作）
    public void execute();
    //撤销动作(操作)
    public void undo();
}
