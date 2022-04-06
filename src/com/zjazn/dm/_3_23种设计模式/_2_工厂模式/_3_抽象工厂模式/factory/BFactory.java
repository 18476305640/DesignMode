package com.zjazn.dm._3_23种设计模式._2_工厂模式._3_抽象工厂模式.factory;

import com.zjazn.dm._3_23种设计模式._2_工厂模式._3_抽象工厂模式.chair.Achair;
import com.zjazn.dm._3_23种设计模式._2_工厂模式._3_抽象工厂模式.chair.Bchair;
import com.zjazn.dm._3_23种设计模式._2_工厂模式._3_抽象工厂模式.chair.Chair;
import com.zjazn.dm._3_23种设计模式._2_工厂模式._3_抽象工厂模式.table.Btable;
import com.zjazn.dm._3_23种设计模式._2_工厂模式._3_抽象工厂模式.table.Table;

public class BFactory implements Factory{
    @Override
    public Chair createChair() {
        return new Bchair();
    }

    @Override
    public Table createTable() {
        return new Btable();
    }
}
