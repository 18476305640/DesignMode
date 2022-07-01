package com.zhuangjie.dp._行为型._3_命令模式;

public class Controller {
    public static void call(Command command) {
        command.execute();
    }
}
