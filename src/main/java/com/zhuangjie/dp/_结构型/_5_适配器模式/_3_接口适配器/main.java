package com.zhuangjie.dp._结构型._5_适配器模式._3_接口适配器;

public class main {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void m1() {
                System.out.println("使用了m1的方法");
            }
        };
        absAdapter.m1();

    }
}
