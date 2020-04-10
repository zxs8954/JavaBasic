package com.java.list19.set.hashset;

public class Person {
    private String name;
    private int age;

    //重写hashCode，判断相同元素
    public int hashCode(){
        return name.hashCode()+age*2;
    }
    //重写equals,判断元素是否相同
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj==null){
            return false;
        }
        if(obj instanceof Person){
            Person p=(Person)obj;
            return name.equals(p.name) &&age==p.age;
        }
        return false;
    }
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /*
     * 没有重写福利，每次运行结果都是不同的整数
     * 如果子类重写父类的方法，哈希值，自定义的，调用子类哈希值
     * */
}
