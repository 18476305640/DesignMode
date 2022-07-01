package com.zhuangjie.dp._行为型._6_观察者模式;


public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        //加入观察者
        subject.addObserver((obj,arg)-> System.out.println("监听到变化，并得到参数，"+arg));
        //触发修改
        subject.modify();
    }
}
