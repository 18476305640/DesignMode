package com.zhuangjie.dp._行为型._6_观察者模式;

import java.util.Date;
import java.util.Observable;

public class Subject extends Observable { //使用JDK内部提供的类 Observable
    public void modify() {
        System.out.println("正在对对象进行修改");
        //设置为已改变
        this.setChanged();
        //通知观察者
        this.notifyObservers(new Date());
    }
}
