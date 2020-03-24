package cn.jiahui.aboutInreface;

public abstract class MyInterfaceImpAbs implements MyInterface01,MyInterface02 {
    @Override
    public void A() {

    }

    @Override
    public void method01() {
        System.out.println("重写了冲突的默认方法");
    }

    @Override
    public void B() {

    }


    //没有全部覆盖重写接口中的抽象方法，该实现类为抽象类

}
