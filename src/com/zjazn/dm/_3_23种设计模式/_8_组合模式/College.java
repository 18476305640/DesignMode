package com.zjazn.dm._3_23种设计模式._8_组合模式;

import java.util.ArrayList;

/**
 * 学院类
 */
public class College extends OrganizationComponent{
    private String name;
    private String desc;
    private ArrayList<OrganizationComponent> ocs = new ArrayList<>();
    public College(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public void add(OrganizationComponent oc) {
        ocs.add(oc);
    }

    @Override
    public void remove(OrganizationComponent oc) {
        ocs.remove(oc);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public void print() {
        System.out.println("===========学院："+this.name+" & 描述："+this.desc+"========");
        System.out.println("===========专业（系）[list]========>");
        for (OrganizationComponent oc:ocs) {
            System.out.println(oc.getName());
        }
    }
}
