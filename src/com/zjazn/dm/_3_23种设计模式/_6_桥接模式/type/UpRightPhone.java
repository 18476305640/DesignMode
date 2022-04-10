package com.zjazn.dm._3_23种设计模式._6_桥接模式.type;

import com.zjazn.dm._3_23种设计模式._6_桥接模式.phone.Brand;

public class UpRightPhone extends Phone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        System.out.print("直立手机——");
        super.open();
    }

    @Override
    public void close() {
        System.out.print("直立手机——");
        super.close();
    }

    @Override
    public void call() {
        System.out.print("直立手机——");
        super.call();
    }
}
