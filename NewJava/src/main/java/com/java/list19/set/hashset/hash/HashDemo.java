package com.java.list19.set.hashset.hash;
/*
 * HashSet集合特点：
 *   底层数据结构哈希表
 *   存储和取出都快
 * 线程不安全，运算速度快
 *
 * 哈希表示数组和链表的结合体，有链表和数组的双重结构。    哈希表的迭代性能受桶的数量和长度限制  初始数组容量是16
 *       加载因子：一个数组上的元素个数0.75  那么一个桶上的元素就是16*0.75个，如果超过这个数值就会重新创建一个桶
 * */

import com.java.list19.set.hashset.Person;

/*
* 对象的哈希值，普通的十进制数
* 父类Object,方法public int hashCode()计算结果int整数
* */
public class HashDemo {
    public static void main(String[] args) {
        Person p=new Person();
        int i=p.hashCode();//计算Person的hash值
        System.out.println(i);

        String s1="abc";
        String s2=new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());//s1和s2哈希值一样
    }
}
