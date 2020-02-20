package cn.jiahui.jiekou;

public class TestStaticInner {
    public static void main(String[] args){
        Outer2.Inner2 inner = new Outer2.Inner2();//静态内部类的调用
    }
}
class Outer2 {
    static class Inner2 {  //静态内部类

    }
}