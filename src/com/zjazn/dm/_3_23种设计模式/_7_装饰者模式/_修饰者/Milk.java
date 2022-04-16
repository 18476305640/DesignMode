package com.zjazn.dm._3_23种设计模式._7_装饰者模式._修饰者;

import com.zjazn.dm._3_23种设计模式._7_装饰者模式.Decorator;
import com.zjazn.dm._3_23种设计模式._7_装饰者模式.Drink;

public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setPrice(3.0f);
        setDesc("牛奶-"+getPrice());
    }
}
