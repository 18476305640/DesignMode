package com.zjazn.dm._1_七大原则._4_里氏替换原则;

public class _1_未遵守 {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("1-2="+a.fun1(1, 2));

        A ab = new B();
        System.out.println("1-2="+ab.fun1(1, 2));
    }
}


class A {
    public int fun1(int num1,int num2) {
        return num1 - num2;
    }
}
class B extends A{
    public int fun1(int num1,int num2) {
        System.out.println("调用了子类的方法, 如果遵循里氏替换原则，尽量不写父类已实现的方法，可以重写接口。");
        return num1 - num2;
    }
    public int fun2(int num1,int num2) {
        return num1 + num2;
    }

}
