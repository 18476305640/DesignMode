package com.zjazn.dm._3_23种设计模式._7_装饰者模式;

/**
 * 饮品抽象类（单品）
 */
public abstract class Coffee extends Drink{

    @Override
    public float cost() {
        return super.getPrice();
    }

}
