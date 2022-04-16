package com.zjazn.dm._3_23种设计模式._9_外观模式._服务模块;

/**
 * 投影仪
 */
public class Projector {
    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" Projector on ");
    }

    public void off() {
        System.out.println(" Projector ff ");
    }

    public void focus() {
        System.out.println(" Projector is Projector  ");
    }
}
