package com.zjazn.dm._3_23种设计模式._2_工厂模式._1_简单工厂模式;

/**
 * 4、写了一个简单工厂类，对水果类进行生产
 */
public class FruitFactory {
    public Fruit createFruit(String type) {

        System.out.println("简单工厂模式正在创建实例~");
        if (type.equals("apple")) {
            return  new Apple();
        }else if (type.equals("pear")) {
            return new Pear();
        }
        return null;
    }
}
