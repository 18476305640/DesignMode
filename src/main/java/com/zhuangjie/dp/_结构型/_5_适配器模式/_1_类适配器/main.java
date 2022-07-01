package com.zhuangjie.dp._结构型._5_适配器模式._1_类适配器;

/**
 * 继承实现，但违反了合成复用原则
 */
public class main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
