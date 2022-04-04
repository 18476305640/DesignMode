package com.zjazn.dm._3_23种设计模式._2_工厂模式._1_简单工厂模式;

/**
 * 5、简单工厂模式测试入口
 */
public class main {
    public static void main(String[] args) {
        Fruit pear = FruitFactory.createFruit("pear");
        pear.getName();

        Fruit apple = FruitFactory.createFruit("apple");
        apple.getName();

    }
}
