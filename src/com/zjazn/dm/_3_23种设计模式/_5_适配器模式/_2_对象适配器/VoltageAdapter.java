package com.zjazn.dm._3_23种设计模式._5_适配器模式._2_对象适配器;

public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V;

    //由继承转为聚合的方式——对象适配器
    public void setVoltage220V(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int srcV = voltage220V.output220V();
        int dstV = srcV / 44;
        System.out.println("被转换成为"+dstV+"V");
        return dstV;
    }
}
