package com.zjazn.dm._3_23种设计模式._2_工厂模式._2_工厂方法模式.order;

import com.zjazn.dm._3_23种设计模式._2_工厂模式._2_工厂方法模式.pizza.Pizza;


public abstract class OrderPizza {
    //定义一个抽象方法，createPizza,让各个工厂子类自己实现
    public abstract Pizza createPizza(String orderType);

}
