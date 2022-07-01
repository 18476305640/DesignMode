package com.zhuangjie.dp._行为型._3_命令模式;

public class OpenCommand implements Command {
    private Receiver receiver;
    public OpenCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.action();
    }
}
