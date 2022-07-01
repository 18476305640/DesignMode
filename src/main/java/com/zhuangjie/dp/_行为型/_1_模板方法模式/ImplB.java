package com.zhuangjie.dp._行为型._1_模板方法模式;

public class ImplB extends Template{
    void register() {
        System.out.println("B正在挂号");
    }

    void takeNumber() {
        System.out.println("B正在取号");
    }
}
