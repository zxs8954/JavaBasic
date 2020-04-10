package com.java.properties25.demo1;

import java.io.Serializable;

public class Person implements Serializable {
    //transient使用这个关键字，不能被序列化,只能用于成员变量
    private transient String name;
    public int age;
    //自定义序列号
    static final long serialVersionUID=42L;
    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
