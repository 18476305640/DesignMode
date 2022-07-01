package com.zhuangjie.dp._创建型._4_原型模式._2_深拷贝;

import java.io.*;

/**
 * 深拷贝有两种实现方案：
 *  重写Cloneable的clone，对对象的变量进行再拷贝（有明显缺点）
 *  利用序列化与反序列化的方法实现（推荐）
 */
public class Sheep implements Cloneable, Serializable {
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

    //利用clone进行深拷贝，这有明显的缺点就是有越多的成员对象，拷贝就要写多少。或说只要成员变量新加了一个对象的，就需要改clone方法。
    @Override
    protected Object clone() {

        Sheep deep = null;
        try {
            deep = (Sheep) super.clone();
            if (deep.friend != null) { //拷贝的对象不能为null
                deep.friend = (Sheep)friend.clone();
            }
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return deep;

    }

    //深拷贝——利用序列化与反序列化的方式（推荐）
    public Object deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Object obj = ois.readObject();
            return obj;
        }catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;

    }
}
