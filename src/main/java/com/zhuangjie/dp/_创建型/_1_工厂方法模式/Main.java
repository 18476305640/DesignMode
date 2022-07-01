package com.zhuangjie.dp._创建型._1_工厂方法模式;

import com.zhuangjie.dp._创建型._1_工厂方法模式.factory.AppleFactory;
import com.zhuangjie.dp._创建型._1_工厂方法模式.fruit.Apple;

public class Main {
    public static void main(String[] args) {
        Apple apple = new AppleFactory().get();
    }
}
