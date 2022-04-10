package com.zjazn.dm._3_23种设计模式._7_装饰者模式;

/**
 * 辅助品抽象类
 */
public abstract class Decorator extends Drink{
    private Drink obj;
    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public String getDesc() {
        //之前的描述+当前饮品的描述
        return  obj.getDesc()+" && "+this.desc;
    }

    @Override
    public float cost() {
        //之前的总费用 + 当前饮品的费用
        return obj.cost() + this.price;
    }
}
