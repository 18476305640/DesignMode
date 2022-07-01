package com.zhuangjie.dp._结构型._6_代理模式._1_静态代理;

public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师授课中..");
    }
}
