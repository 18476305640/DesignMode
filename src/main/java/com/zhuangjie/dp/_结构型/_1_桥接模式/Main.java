package com.zhuangjie.dp._结构型._1_桥接模式;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        WxPay wxPay = new WxPay(new FacePayMode());
        wxPay.transfer("110","120",new BigDecimal(22));
    }
}
