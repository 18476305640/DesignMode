package com.zhuangjie.dp._创建型._1_工厂方法模式.factory;

import com.zhuangjie.dp._创建型._1_工厂方法模式.fruit.Apple;
import com.zhuangjie.dp._创建型._1_工厂方法模式.fruit.Fruit;

public class AppleFactory extends FruitFactory<Apple> {
    public Apple get() {
        return new Apple();
    }
}
