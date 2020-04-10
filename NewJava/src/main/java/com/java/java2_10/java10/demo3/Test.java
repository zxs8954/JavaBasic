package com.java.java2_10.java10.demo3;

public class Test {
    public static void main(String[] args) {
        Animal a1=new Cat();
        Animal a2=new Dog();
        a1.eat();
        a2.eat();
        Cat c=(Cat)a1;
        Dog d=(Dog)a2;
        c.catchMouse();
        d.lookHome();
    }
}
