package cn.jiahui.jiekou;

public class TestInterFace1 {
}
interface A{
    void test_a();
}
interface B{
    void test_b();
}
interface C extends A,B{
    void test_c();
}
class MyClass implements C{
    @Override
    public void test_a() {
        System.out.println("MyClass.test_a()");
    }

    @Override
    public void test_b() {
        System.out.println("MyClass.test_b()");
    }

    @Override
    public void test_c() {
        System.out.println("MyClass.test_c()");
    }
}
