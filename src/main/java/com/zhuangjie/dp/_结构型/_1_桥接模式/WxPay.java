package com.zhuangjie.dp._结构型._1_桥接模式;

import java.math.BigDecimal;

public class WxPay extends Pay{

    public WxPay(IPayMode iPayMode) {
        this.iPayMode = iPayMode;
    }

    public Boolean transfer(String uId, String tradeiD, BigDecimal amount) {
        System.out.println("使用微信的"+iPayMode+"向"+tradeiD+"支付了"+amount+"元！");
        return true;
    }
}
