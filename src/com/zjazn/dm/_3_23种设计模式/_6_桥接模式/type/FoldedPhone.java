package com.zjazn.dm._3_23种设计模式._6_桥接模式.type;

import com.zjazn.dm._3_23种设计模式._6_桥接模式.phone.Brand;

public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        System.out.print("折叠手机——");
        super.open();

    }

    @Override
    public void close() {
        System.out.print("折叠手机——");
        super.close();
    }

    @Override
    public void call() {
        System.out.print("折叠手机——");
        super.call();
    }
}
