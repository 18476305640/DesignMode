package com.zjazn.dm._3_23种设计模式._7_装饰者模式;

/**
 * 全饮品抽象类
 */
public abstract class Drink {
    public String desc;
    public float price = 0.0f;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    //计算费用的抽象方法
    //子类来实现
    public abstract float cost();


}
