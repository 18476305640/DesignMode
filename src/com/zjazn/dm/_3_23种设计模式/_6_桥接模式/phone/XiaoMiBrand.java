package com.zjazn.dm._3_23种设计模式._6_桥接模式.phone;

public class XiaoMiBrand implements Brand {
    @Override
    public void open() {
        System.out.println("小米手机开机了");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机了");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话了");
    }
}
