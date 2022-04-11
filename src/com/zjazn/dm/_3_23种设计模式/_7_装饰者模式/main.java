package com.zjazn.dm._3_23种设计模式._7_装饰者模式;

import com.zjazn.dm._3_23种设计模式._7_装饰者模式._2_修饰者.Chocolate;
import com.zjazn.dm._3_23种设计模式._7_装饰者模式._2_修饰者.Milk;
import com.zjazn.dm._3_23种设计模式._7_装饰者模式._1_被修饰者.Decaf;
import com.zjazn.dm._3_23种设计模式._7_装饰者模式._1_被修饰者.ShortBlack;

public class main {
    public static void main(String[] args) {
        Drink order = new ShortBlack();
        order = new Chocolate(order);
        order = new Chocolate(order);
        order = new Milk(order);

        System.out.println("描述："+order.getDesc());
        System.out.println("费用："+order.cost());

        System.out.println("=======================");
        Drink order2 = new Decaf();
        order2 = new Milk(order2);
        System.out.println("描述："+order2.getDesc());
        System.out.println("费用："+order2.cost());
    }
}
