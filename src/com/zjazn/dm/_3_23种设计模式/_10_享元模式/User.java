package com.zjazn.dm._3_23种设计模式._10_享元模式;
//外部状态
public class User {
    public String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUser(String name) {
        this.name = name;
    }
}
