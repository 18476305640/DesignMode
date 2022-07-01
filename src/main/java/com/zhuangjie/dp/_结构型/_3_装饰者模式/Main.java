package com.zhuangjie.dp._结构型._3_装饰者模式;

public class Main {
    public static void main(String[] args) {
        BaseImpl base = new BaseImpl();
        Decorator decorator = new Decorator(base);
        decorator.test();
    }
}
