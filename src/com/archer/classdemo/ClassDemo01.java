package com.archer.classdemo;

/**
 * Created by Archer on 2016/3/24.
 * @function 说明对象和类之间的关系
 * 以及对象属性的赋值和方法的调用
 *
 */
public class ClassDemo01 {
    public static void main(String[] args) {
/**
 * 创建对象
 *
        Person person=null;
        //实例化操作
        person= new Person();
        对象.属性可以进行赋值
        对象.方法可以进行调用
         必须使用new关键字实例化 开辟 堆内存空间
 否则 栈会出现空指针异常

 */
        Person person =new Person();
        person.name="鲤鱼";
        person.age=21;
        person.tell();
    }
}


//新建一个person类
class Person{

    String name;
    int age;

    //方法
    void tell(){
        System.out.println("姓名 "+name+"  "+"年龄 "+age);
    }

}
