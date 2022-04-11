package com.zjazn.dm._3_23种设计模式._8_组合模式;

import java.util.ArrayList;

/**
 *总抽象类：组织
 */
public abstract class OrganizationComponent {
    private String name;
    private String desc;
    //集合
    private ArrayList<OrganizationComponent> ocs = new ArrayList<>();


    public void add(OrganizationComponent oc) {
        throw new UnsupportedOperationException();
    }
    public void remove(OrganizationComponent oc) {
        throw new UnsupportedOperationException();
    }

    //get & set 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    //输出抽象类
    public abstract void print();
}
