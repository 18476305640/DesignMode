package com.zjazn.dm._3_23种设计模式._8_组合模式;

/**
 * 专业类
 */
public class Department extends OrganizationComponent{
    private String name;
    private String desc;

    public Department(String name, String desc) {
        this.name = name;
        this.desc = desc;
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
        System.out.println(this.name);
    }
}
