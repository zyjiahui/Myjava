package cn.jiahui.jiekou;

public interface MyInterface {
   /*public abstract*/ void Test01();
    /*public static final*/ int AGE_MAX=120;
}

class MyClass1 implements MyInterface{
    @Override
    public void Test01() {
        System.out.println("MyClass.Test01()");
        System.out.println(AGE_MAX);
    }
}