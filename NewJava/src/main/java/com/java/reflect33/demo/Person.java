package com.java.reflect33.demo;

public class Person {
    public String name;
    private int age;
    static {
        System.out.println("静态代码块");
    }
    public Person(){}
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    private Person(int age,String name){
        this.name=name;
        this.age=age;
    }
    public void eat(){
        System.out.println("人吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
