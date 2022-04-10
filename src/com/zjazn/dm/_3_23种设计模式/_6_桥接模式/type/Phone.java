package com.zjazn.dm._3_23种设计模式._6_桥接模式.type;

import com.zjazn.dm._3_23种设计模式._6_桥接模式.phone.Brand;

public abstract class Phone {
    private Brand brand;
    public Phone(Brand brand) {
        this.brand = brand;
    }
    public void open() {
        this.brand.open();
    }
    public void close() {
        this.brand.close();
    }
    public void call() {
        this.brand.call();
    }

}
