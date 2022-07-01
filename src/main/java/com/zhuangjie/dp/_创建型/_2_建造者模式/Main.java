package com.zhuangjie.dp._创建型._2_建造者模式;
public class Main  {
    public static void main(String[] args) {
        Student student = Student.Builder() //创建一个建造者，
                .id("19060201111") //建造流程
                .name("zhuangjie") //建造流程
                .age(23)  //建造流程
                .build(); //指挥者

        System.out.println(student); //student 是建造的产品
    }
}
