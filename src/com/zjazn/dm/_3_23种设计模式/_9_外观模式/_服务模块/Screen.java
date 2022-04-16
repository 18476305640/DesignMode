package com.zjazn.dm._3_23种设计模式._9_外观模式._服务模块;

/**
 * 屏幕
 */
public class Screen {
    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }


    public void up() {
        System.out.println(" Screen up ");
    }

    public void down() {
        System.out.println(" Screen down ");
    }
}
