package com.zjazn.dm._3_23种设计模式._2_工厂模式._3_抽象工厂模式.factory;

import com.zjazn.dm._3_23种设计模式._2_工厂模式._3_抽象工厂模式.chair.Chair;
import com.zjazn.dm._3_23种设计模式._2_工厂模式._3_抽象工厂模式.table.Table;

public interface Factory {
    Chair createChair();
    Table createTable();
}
