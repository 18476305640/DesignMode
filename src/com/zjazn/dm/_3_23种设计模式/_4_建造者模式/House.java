package com.zjazn.dm._3_23种设计模式._4_建造者模式;
//产品->Product
public class House {
    private String baise;
    private String wall;
    private String roofed;

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }

    public String getBaise() {
        return baise;
    }

    public void setBaise(String baise) {
        this.baise = baise;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }
}
