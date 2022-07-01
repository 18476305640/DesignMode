package com.zhuangjie.dp._结构型._4_外观模式;

import java.util.ArrayList;
import java.util.List;

public class Facade {
    private static List<Service> list = new ArrayList<Service>();

    static {
        list.add(new ServiceA());
        list.add(new ServiceB());
        list.add(new ServiceC());
    }
    public static void handles() {
        for (Service item: list) {
            item.handle();
        }
    }

}

