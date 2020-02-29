package cn.jiahui.abstractTest;

public class Rectangle extends Shape{
    private int a;
    private int b;
    public void perimeter(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println((a+b)*2);
    }
    public void area(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println(a*b);
    }

}
