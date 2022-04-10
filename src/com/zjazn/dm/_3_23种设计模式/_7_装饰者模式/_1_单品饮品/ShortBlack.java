package com.zjazn.dm._3_23种设计模式._7_装饰者模式._1_单品饮品;

import com.zjazn.dm._3_23种设计模式._7_装饰者模式.Coffee;
//单品 ShortBlack
public class ShortBlack extends Coffee {
    public ShortBlack() {
        setPrice(5.0f);
        setDesc("ShortBlack（单品）-"+getPrice());
    }


}
