package com.zjazn.dm._3_23种设计模式._11_代理模式._1_静态代理;

public class TeacherDaoProxy implements ITeacherDao{
    private ITeacherDao target;
    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }
    @Override
    public void teach() {
        System.out.println("[代理前的操作...]");
        target.teach();
        System.out.println("[代理后的操作...]");
    }
}
