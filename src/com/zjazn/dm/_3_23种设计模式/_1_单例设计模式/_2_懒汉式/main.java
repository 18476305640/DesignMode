package com.zjazn.dm._3_23种设计模式._1_单例设计模式._2_懒汉式;

public class main {
    public static void main(String[] args) {
        Singleton_Type3 instance31 = Singleton_Type3.getInstance();
        Singleton_Type3 instance32 = Singleton_Type3.getInstance();
        System.out.println(instance31==instance32);
        System.out.println(instance31.hashCode()+"=="+instance32.hashCode());


        Singleton_Type4 instance41 = Singleton_Type4.getInstance();
        Singleton_Type4 instance42 = Singleton_Type4.getInstance();
        System.out.println(instance41==instance42);
        System.out.println(instance41.hashCode()+"=="+instance42.hashCode());

        Singleton_Type5 instance51 = Singleton_Type5.getInstance();
        Singleton_Type5 instance52 = Singleton_Type5.getInstance();
        System.out.println(instance51==instance52);
        System.out.println(instance51.hashCode()+"=="+instance52.hashCode());

        Singleton_Type6 instance61 = Singleton_Type6.getInstance();
        Singleton_Type6 instance62 = Singleton_Type6.getInstance();
        System.out.println(instance61==instance62);
        System.out.println(instance61.hashCode()+"=="+instance62.hashCode());

        Singleton_Type7 instance71 = Singleton_Type7.INSTANCE;
        Singleton_Type7 instance72 = Singleton_Type7.INSTANCE;
        System.out.println(instance71==instance72);
        System.out.println(instance71.hashCode()+"=="+instance72.hashCode());

    }
}
//存在线程安全问题
class Singleton_Type3 {
    //创建实例的成员变量
    private  static Singleton_Type3 instance;
    //让构造方法为私有，使不能用
    private Singleton_Type3() {}
    //向外提供一个获取实例的方法
    public static Singleton_Type3 getInstance() {
        if (instance == null) {
            instance = new Singleton_Type3();
        }
        return instance;
    }
}
//解决了上面的线程安全问题，但这种效率低
class Singleton_Type4 {
    //创建实例的成员变量
    private static Singleton_Type4 instance;
    //让构造方法为私有，使不能用
    private Singleton_Type4() {}
    //向外提供一个获取实例的方法, 加了方法同步代码块 “synchronized”
    public static synchronized Singleton_Type4 getInstance() {
        if (instance == null) {
            instance = new Singleton_Type4();
            //也有人把像synchronized放在下面这样写，这是错误的，多余的，无法解决线程安全问题，在多线程下，会产生多个实例
            //            synchronized (Singleton_Type4.class) {
            //                instance = new Singleton_Type4();
            //            }
        }
        return instance;
    }
}
//解决了线程安全，效率低问题——“双重检查” Double Check
class Singleton_Type5 {
    //创建一个成员变量
    //volatile 作用是在多线程操作下，第一，修改后，直接将线程的操作内存，放在所有线程的主操作内存上，会同步到所有线程内存——可见性。第二，禁止指令重排优化的规则，避免系统优化机制的干扰
    //详细的volatile作用：https://blog.csdn.net/qiushisoftware/article/details/102912395
    private static volatile Singleton_Type5 instance;
    //使构造方法私有，对外不可见
    private Singleton_Type5(){}
    //创建一个方法，使外界获取单一实例
    public static Singleton_Type5 getInstance() {
        //第一层检查虽然不能拦着后面的线程，但可以保证成员变量 instance 赋值后，不让线程执行synchronized 同步代码块，从而造成的效率低问题
        if (instance == null) {
            //同步代码块
            synchronized (Singleton_Type5.class) {
                //让界于第一层if与synchronized 的初始线程，跳过，从而避免其它线程创建实例
                if (instance == null) {
                    instance = new Singleton_Type5();
                }
            }
        }
        return instance;
    }

}

//使用“静态内部类”的方法实现单一实例，且具线程安全，效率问题,同时也是具有懒加载的
class Singleton_Type6 {
    private Singleton_Type6(){

    }
    //类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
    private static class SingletonInstance {
        public static final Singleton_Type6 INSTANCE = new Singleton_Type6();
    }
    public static Singleton_Type6 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}

//使用“枚举”要实现,同样可以解决线程安全，且不存在效率问题，推荐使用
enum Singleton_Type7 {
    INSTANCE;
}

