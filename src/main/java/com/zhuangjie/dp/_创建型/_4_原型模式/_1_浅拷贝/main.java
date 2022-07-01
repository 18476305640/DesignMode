package com.zhuangjie.dp._创建型._4_原型模式._1_浅拷贝;

public class main {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1);
        sheep.friend = new Sheep("beautiful",2);

        Sheep sheep1 = (Sheep)sheep.clone();
        Sheep sheep2 = (Sheep)sheep.clone();
        Sheep sheep3 = (Sheep)sheep.clone();
        //可以看出克隆出来的羊，基本数据类型会进行值传递，如果是对象类型，它们的的hashCode是相同的。这也就是浅拷贝的特点。
        System.out.println("sheep1 = "+sheep1+", friend = "+sheep1.getFriend().hashCode());
        System.out.println("sheep2 = "+sheep2+", friend = "+sheep2.getFriend().hashCode());

        System.out.println("sheep3 = "+sheep3+", friend = "+sheep3.getFriend().hashCode());
    }
}
