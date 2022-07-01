package com.zhuangjie.dp._创建型._1_工厂方法模式.factory;

import com.zhuangjie.dp._创建型._1_工厂方法模式.fruit.Fruit;

public abstract class FruitFactory<T extends Fruit> {
    public abstract T get();

}
