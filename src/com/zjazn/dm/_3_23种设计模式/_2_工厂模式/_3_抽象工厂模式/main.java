package com.zjazn.dm._3_23种设计模式._2_工厂模式._3_抽象工厂模式;

import com.zjazn.dm._3_23种设计模式._2_工厂模式._3_抽象工厂模式.chair.Chair;
import com.zjazn.dm._3_23种设计模式._2_工厂模式._3_抽象工厂模式.factory.AFactory;
import com.zjazn.dm._3_23种设计模式._2_工厂模式._3_抽象工厂模式.factory.BFactory;
import com.zjazn.dm._3_23种设计模式._2_工厂模式._3_抽象工厂模式.table.Table;

public class main {
    public static void main(String[] args) {
        Table table = new AFactory().createTable();
        table.explain();

        Chair chair = new BFactory().createChair();
        chair.explain();
    }
}
