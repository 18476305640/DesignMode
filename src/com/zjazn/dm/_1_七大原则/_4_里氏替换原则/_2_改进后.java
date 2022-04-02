package com.zjazn.dm._1_七大原则._4_里氏替换原则;

public class _2_改进后 {
    public static void main(String[] args) {
        _A a = new _A();
        System.out.println(a.fun1(1, 2));
        System.out.println();
        int[] ab = new int[100];

    }
}

class Base {

}

class _A extends  Base {
    public int fun1(int num1,int num2) {
        return num1 - num2;
    }
}
class _B extends Base {
    private _A a = new _A();
    public int fun1(int num1,int num2) {
        return a.fun1(num1,num2);
    }
    public int fun2(int num1,int num2) {
        return num1 + num2;
    }


}
