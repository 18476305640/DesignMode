package com.zjazn.dm._3_23种设计模式._12_模板模式.improve;

public class PureSoyaMilk extends SoyaMilk {

    @Override
    void addCondiments() {
        //空实现
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
