package cn.jiahui.studyInterface;

public class Test01 {
    public static void main(String[] args) {
        //该实例化错误，不能实例化接口对象，应该实例化实现类对象
        //MyInterfaceDefault a = new MyInterfaceDefault();
        MyInterfaceDefaultTest01 m1 = new MyInterfaceDefaultTest01();
        m1.methodAbs();//调用抽象方法
        m1.methodDefault();//该实现类的实例化对象并没有该方法，来自于它的接口中的默认方法，但是该实现类如果覆盖重写了默认方法，则调用覆盖重写之后的方法
        System.out.println("________________________________");
        MyInterfaceDefaultTest02 m2 = new MyInterfaceDefaultTest02();
        m2.methodAbs();
        m2.methodDefault();
    }
}
