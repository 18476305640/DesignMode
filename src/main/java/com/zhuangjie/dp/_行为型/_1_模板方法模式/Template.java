package com.zhuangjie.dp._行为型._1_模板方法模式;

public abstract class Template {
    abstract void register();
    abstract void takeNumber();
    void fixed() {
        register();
        takeNumber();
    }
}
