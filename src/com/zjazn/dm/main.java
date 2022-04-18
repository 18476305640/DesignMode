package com.zjazn.dm;
import java.lang.String;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

public class main {


    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        //说明
        //1. InputStream 是抽象类, 类似我们前面讲的 Drink
        //2. FileInputStream 是	InputStream 子类，类似我们前面的 DeCaf, LongBlack
        //3. FilterInputStream	是	InputStream 子类：类似我们前面 的 Decorator 修饰者
        //4. DataInputStream 是 FilterInputStream 子类，具体的修饰者，类似前面的 Milk, Soy 等
        //5. FilterInputStream 类 有	protected volatile InputStream in; 即含被装饰者
        //6. 分析得出在 jdk 的 io 体系中，就是使用装饰者模式

//        DataInputStream dis = new DataInputStream(new FileInputStream("d:\\abc.txt"));
//        System.out.println(dis.read());
//        dis.close();
//
//
//        Map<String, String> map = new HashMap<String, String>();

        Integer integer1 =100;
        Integer integer2 = Integer.valueOf(100);
        System.out.println(integer1 == integer2);

        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);

    }


}
