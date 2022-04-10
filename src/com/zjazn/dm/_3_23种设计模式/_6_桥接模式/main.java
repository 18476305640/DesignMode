package com.zjazn.dm._3_23种设计模式._6_桥接模式;

import com.zjazn.dm._3_23种设计模式._6_桥接模式.phone.VivoBrand;
import com.zjazn.dm._3_23种设计模式._6_桥接模式.phone.XiaoMiBrand;
import com.zjazn.dm._3_23种设计模式._6_桥接模式.type.FoldedPhone;
import com.zjazn.dm._3_23种设计模式._6_桥接模式.type.UpRightPhone;

public class main {
    public static void main(String[] args) {
        FoldedPhone phone1 = new FoldedPhone(new XiaoMiBrand());
        phone1.open();
        phone1.call();
        phone1.close();
        System.out.println("=================");
        UpRightPhone phone2 = new UpRightPhone(new VivoBrand());
        phone2.open();
        phone2.call();
        phone2.close();

    }
}
