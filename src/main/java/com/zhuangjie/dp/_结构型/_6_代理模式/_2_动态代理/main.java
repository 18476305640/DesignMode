package com.zhuangjie.dp._结构型._6_代理模式._2_动态代理;

public class main {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao target = new TeacherDao();
        //给目标对象，创建代理对象, 可以转成 ITeacherDao
        ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();

        //class com.sun.proxy.$Proxy0 有$代表是代理对象
        System.out.println(proxyInstance.getClass());
        //通过代理对象，调用目标对象的方法
        proxyInstance.sayHello("tom");

    }
}
