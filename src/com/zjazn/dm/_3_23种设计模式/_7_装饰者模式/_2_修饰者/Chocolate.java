package com.zjazn.dm._3_23种设计模式._7_装饰者模式._2_修饰者;

import com.zjazn.dm._3_23种设计模式._7_装饰者模式.Decorator;
import com.zjazn.dm._3_23种设计模式._7_装饰者模式.Drink;

//辅助品——巧克力
public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setPrice(2.0f);
        setDesc("巧克力-"+this.getPrice());

    }
}
