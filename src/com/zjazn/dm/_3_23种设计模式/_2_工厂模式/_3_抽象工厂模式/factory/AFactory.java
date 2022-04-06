package com.zjazn.dm._3_23种设计模式._2_工厂模式._3_抽象工厂模式.factory;

import com.zjazn.dm._3_23种设计模式._2_工厂模式._3_抽象工厂模式.chair.Achair;
import com.zjazn.dm._3_23种设计模式._2_工厂模式._3_抽象工厂模式.chair.Chair;
import com.zjazn.dm._3_23种设计模式._2_工厂模式._3_抽象工厂模式.table.Atable;
import com.zjazn.dm._3_23种设计模式._2_工厂模式._3_抽象工厂模式.table.Table;

public class AFactory implements Factory {
    @Override
    public Chair createChair() {
        return new Achair();
    }

    @Override
    public Table createTable() {
        return new Atable();
    }
}
