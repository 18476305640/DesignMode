package com.zhuangjie.dp._行为型._2_责任链模式;

public class AHandle extends Handle{
    @Override
    public void doHandle() {
        System.out.println("程序A执行");
    }
}
