package com.zjazn.dm._3_23种设计模式._5_适配器模式._2_对象适配器;

/**
 * 由继承转为聚合的方式——对象适配器
 */
public class main {
    public static void main(String[] args) {
        //一个手机
        Phone phone = new Phone();
        //一个适配器（充电器）
        VoltageAdapter voltageAdapter = new VoltageAdapter();
        //适配器插上插座
        voltageAdapter.setVoltage220V(new Voltage220V());
        //适配器给手机充电
        phone.charging(voltageAdapter);
    }
}
