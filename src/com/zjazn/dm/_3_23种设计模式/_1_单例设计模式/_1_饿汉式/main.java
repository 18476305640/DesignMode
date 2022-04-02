package com.zjazn.dm._3_23种设计模式._1_单例设计模式._1_饿汉式;

/**
 * 饿汉式，就是还没用时就创建，饿汉式的实现方法有二种，但作用上没什么区别，
 *      第一，是通过直接new的方式，第二，是通过静态代码块的方式
 *      优点：无多线程问题
 *      缺点：浪费内存
 */
public class main {
    public static void main(String[] args) {
        //直接new的两个对象
        Singleton_type1 instance11 = Singleton_type1.getInstance();
        Singleton_type1 instance12 = Singleton_type1.getInstance();
        //通过静态代码块实现的两个对昂
        Singleton_type2 instance21 = Singleton_type2.getInstance();
        Singleton_type2 instance22 = Singleton_type2.getInstance();
        //分别判断是否相等
        System.out.println(instance11.hashCode()+"=="+instance12.hashCode());
        System.out.println(instance21.hashCode()+"=="+instance22.hashCode());
    }

}
//饿汉式，直接new实现
class Singleton_type1 {
    //1.设置为私有，使不能new
    private Singleton_type1() {

    }
    //2.开始创建对象
    private final static Singleton_type1 instance = new Singleton_type1();

    //3。使能让外界获取该对象实例
    public static Singleton_type1 getInstance() {
        return instance;
    }
}
//饿汉式，通过”静态代码块“进行内部创建实现
class Singleton_type2 {
    //1.设置为私有，使不能new
    private Singleton_type2() {

    }
    //2.开始创建对象
    private final static Singleton_type2 instance;
    static {
        instance = new Singleton_type2();
    }

    //3。使能让外界获取该对象实例
    public static Singleton_type2 getInstance() {
        return instance;
    }
}

