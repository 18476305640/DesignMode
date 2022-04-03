package com.zjazn.dm._3_23种设计模式._2_工厂模式._1_简单工厂模式;

/**
 * 5、简单工厂模式测试入口
 */
public class main {
    public static void main(String[] args) {
        FruitFactory factory = new FruitFactory();
        Fruit pear = factory.createFruit("pear");
        pear.getName();

        Fruit apple = factory.createFruit("apple");
        apple.getName();

    }
}
