package com.zjazn.dm._3_23种设计模式._3_原型链模式._1_浅拷贝;

public class Sheep implements Cloneable {
    public String name;
    public int age;
    public String address = "蒙古羊";
    Sheep friend;

    public Sheep(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", friend=" + friend +
                '}';
    }

    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        }catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return clone;
    }
}
