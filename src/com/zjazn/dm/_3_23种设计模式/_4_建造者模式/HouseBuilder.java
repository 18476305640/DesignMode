package com.zjazn.dm._3_23种设计模式._4_建造者模式;

public abstract class HouseBuilder {
    protected House house = new House();

    //将建造的流程写好, 抽象的方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    //建行房子后，将产品（房子）返回
    public House buildHouse() {
        return house;
    }

}
