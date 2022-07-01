package com.zhuangjie.dp._结构型._3_装饰者模式;

public class Decorator implements Base{
    private Base base;

    public Decorator(Base base) {
        this.base = base;
    }

    public void test() {
        System.out.println("方法前装饰");
        base.test();
        System.out.println("方法后装饰");

    }
}
