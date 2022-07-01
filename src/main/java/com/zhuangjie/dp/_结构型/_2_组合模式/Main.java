package com.zhuangjie.dp._结构型._2_组合模式;

import com.alibaba.fastjson.JSON;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Organization organization = new Organization();

        University xin = new University("清华大学");
        College ac = new College("信息与自动化学院");
        College bc = new College("xx学院");
        ac.add(new Major("软件技术"));
        ac.add(new Major("网络工程"));
        xin.add(ac);
        xin.add(bc);

        organization.add(xin);
        organization.add(new University("野鸡大学"));
        Organization down = organization.down("清华大学").down("信息与自动化学院");
        System.out.println(down.subordinate);




    }
}
