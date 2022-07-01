package com.zhuangjie.dp._结构型._1_桥接模式;

import java.math.BigDecimal;

public abstract class Pay {
    public IPayMode iPayMode;
    public abstract Boolean transfer(String uId, String tradeiD, BigDecimal amount);

}
