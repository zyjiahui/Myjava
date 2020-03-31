package cn.jiahui.homework;

public class TestB {
    public static void main(String[] args) {
        B1 b = new B1();
        System.out.println(b.f(3,5));
        System.out.println(b.f(3.0,5.0));
    }
}
class A1{
    double f(double x,double y){
        return x+y;
    }
}
class B1 extends A1{
    double f(int x,int y){
        return x*y;
    }
}
