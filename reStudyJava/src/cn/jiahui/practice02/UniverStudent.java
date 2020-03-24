package cn.jiahui.practice02;

public class UniverStudent extends Student {
    boolean isMarriage; //是否结婚
    UniverStudent(int number,String name,boolean isMarriage){  //含参数的构造函数
        super(number,name);   //super关键字调用父类的方法 Student()
        this.isMarriage = isMarriage;
    }
    public boolean getIsMarriage(){
        return isMarriage;
    }
}
