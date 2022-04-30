package com.zjazn.dm._3_23种设计模式._11_代理模式._1_静态代理;

public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师授课中..");
    }
}
