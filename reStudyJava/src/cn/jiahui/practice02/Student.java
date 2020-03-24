package cn.jiahui.practice02;

public class Student {
    int number;//学号
    String name; //姓名
    Student(){  //无参构造函数

    }
    Student(int number,String name){  //含参构造函数
        this.number = number;
        this.name = name;
    }
    public int getNumber(){   //获取学号方法
        return number;
    }
    public String getName(){  //获取名字的方法
        return name;
    }
}
