package cn.jiahui.studyInterface;

public class MyInterfaceDefaultTest01 implements MyInterfaceDefault  {

    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法，aaa");
    }

    //重写接口中的默认方法
    @Override
    public void methodDefault() {
        System.out.println("实现类覆盖重写了接口中的默认方法");
    }
}
