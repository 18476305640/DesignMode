package com.zjazn.dm._3_23种设计模式._5_适配器模式._2_对象适配器;

public class Voltage220V {
    //输出220V的电压
    public int output220V() {
        int src = 220;
        System.out.println("插座输出=" + src + "伏");
        return src;
    }
}
