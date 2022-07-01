package com.zhuangjie.dp._行为型._2_责任链模式;

public class Main {
    public static void main(String[] args) {
        AHandle headHandle = new AHandle();
        headHandle
                .connect(new BHandle())
                .connect(new CHandle());
        headHandle.handle();
    }
}
