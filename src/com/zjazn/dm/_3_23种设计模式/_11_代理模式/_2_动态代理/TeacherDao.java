package com.zjazn.dm._3_23种设计模式._11_代理模式._2_动态代理;

public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        // TODO Auto-generated method stub
        System.out.println(" 老师授课中.... ");
    }

    @Override
    public void sayHello(String name) {
        // TODO Auto-generated method stub
        System.out.println("hello " + name);
    }

}
