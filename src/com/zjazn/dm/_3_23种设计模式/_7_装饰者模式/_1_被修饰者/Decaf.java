package com.zjazn.dm._3_23种设计模式._7_装饰者模式._1_被修饰者;

import com.zjazn.dm._3_23种设计模式._7_装饰者模式.Coffee;

public class Decaf extends Coffee {
    public Decaf() {
        setPrice(5.0f);
        setDesc("Decaf（单品）-"+getPrice());
    }
}
