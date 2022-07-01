package com.zhuangjie.dp._创建型._2_建造者模式;

public class Student {
    private String id;
    private String name;
    private int age;

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public static Student Builder() {
        return new Student();
    }
    public Student id(String id) {
        this.id = id;
        return this;
    }
    public Student name(String name) {
        this.name = name;
        return this;
    }
    public Student age(Integer age) {
        this.age = age;
        return this;
    }
    public Student build() {
        return new Student(id,name,age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
