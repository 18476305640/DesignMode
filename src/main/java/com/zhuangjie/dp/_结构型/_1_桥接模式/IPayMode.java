package com.zhuangjie.dp._结构型._1_桥接模式;

public abstract class IPayMode {
    public String payMode;

    @Override
    public String toString() {
        return payMode;
    }
}
