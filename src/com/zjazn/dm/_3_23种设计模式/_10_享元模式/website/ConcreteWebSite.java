package com.zjazn.dm._3_23种设计模式._10_享元模式.website;

import com.zjazn.dm._3_23种设计模式._10_享元模式.User;

//具体网站
public class ConcreteWebSite extends WebSite {
    //共享的部分，内部状态
    private String type = ""; // //网站发布的形式(类型)

    //构造器
    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        // TODO Auto-generated method stub
        System.out.println("网站的发布形式为:" + type + " 在使用中 .. 使用者是" + user.getName());
    }
}
