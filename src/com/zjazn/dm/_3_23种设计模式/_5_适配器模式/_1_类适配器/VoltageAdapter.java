package com.zjazn.dm._3_23种设计模式._5_适配器模式._1_类适配器;

public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        int srcV = super.output220V();
        int dstV = srcV / 44;
        System.out.println("被转换成为"+dstV+"V");
        return dstV;
    }
}
