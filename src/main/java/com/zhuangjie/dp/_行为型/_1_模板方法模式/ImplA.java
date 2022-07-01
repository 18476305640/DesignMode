package com.zhuangjie.dp._行为型._1_模板方法模式;

public class ImplA extends Template{
    void register() {
        System.out.println("A正在挂号");
    }

    void takeNumber() {
        System.out.println("A正在取号");
    }
}
