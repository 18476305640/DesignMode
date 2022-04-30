package com.zjazn.dm._3_23种设计模式._12_模板模式;

import com.zjazn.dm._3_23种设计模式._12_模板模式.improve.PureSoyaMilk;

public class main {
    public static void main(String[] args) {
        System.out.println("--制作花生豆浆--");
        PeanutSoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();

        System.out.println("--制作红豆豆浆--");
        RedBeanSoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();




    }
}
