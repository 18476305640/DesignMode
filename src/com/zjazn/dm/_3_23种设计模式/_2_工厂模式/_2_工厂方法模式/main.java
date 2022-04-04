package com.zjazn.dm._3_23种设计模式._2_工厂模式._2_工厂方法模式;

import com.zjazn.dm._3_23种设计模式._2_工厂模式._2_工厂方法模式.order.BJOrderPizza;
import com.zjazn.dm._3_23种设计模式._2_工厂模式._2_工厂方法模式.order.LDOrderPizza;
import com.zjazn.dm._3_23种设计模式._2_工厂模式._2_工厂方法模式.pizza.BJPepperPizza;
import com.zjazn.dm._3_23种设计模式._2_工厂模式._2_工厂方法模式.pizza.LDPepperPizza;
import com.zjazn.dm._3_23种设计模式._2_工厂模式._2_工厂方法模式.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        LDOrderPizza factory = new LDOrderPizza();
        LDPepperPizza pizza = (LDPepperPizza) factory.createPizza("pepper");
        System.out.println(pizza.name +"真好吃~");

        BJOrderPizza factory2 = new BJOrderPizza();
        BJPepperPizza pizza2 = (BJPepperPizza) factory2.createPizza("pepper");
        System.out.println(pizza2.name +"真好吃~");


    }
}
