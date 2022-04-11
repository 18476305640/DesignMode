package com.zjazn.dm._3_23种设计模式._8_组合模式;

/**
 * 测试类
 */
public class main {
    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学", "中国顶级大学");

        OrganizationComponent computerCollege = new College("计算机学院", "计算机学院~");
        OrganizationComponent infoEngineercollege = new College("信息工程学院", "信息工程学院~");

        computerCollege.add(new Department("软件工程","软件工程专业不错~"));
        computerCollege.add(new Department("网络工程","网络工程专业不错~"));
        computerCollege.add(new Department("计算机科学与技术","计算机科学与技术专业不错~"));

        infoEngineercollege.add(new Department("通信工程", " 通信工程不好学 "));
        infoEngineercollege.add(new Department("信息工程", " 信息工程好学 "));

        university.add(computerCollege);
        university.add(infoEngineercollege);

        computerCollege.print();
    }
}
