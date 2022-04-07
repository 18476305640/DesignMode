package com.zjazn.dm._3_23种设计模式._5_适配器模式._1_类适配器;

public class Phone {
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压正常，正在充电~");
        }else if(iVoltage5V.output5V() > 5) {
            System.out.println("电压异常，无法正常充电~");
        }
    }
}
