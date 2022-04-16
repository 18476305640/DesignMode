package com.zjazn.dm._3_23种设计模式._9_外观模式;

public class main {
    public static void main(String[] args) {
        //这里直接调用，很麻烦
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();

        homeTheaterFacade.end();


    }
}
