package com.zhuangjie.dp._行为型._4_迭代器模式;

import java.io.InputStream;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"1","2","3"};
        MyArrayList<String> strs = MyArrayList.of(strings);
        for (String str:strs) {
            System.out.println(str);
        }
    }
}
