package cn.jiahui.aboutInreface;

public class MyInterfaceImp implements MyInterface01,MyInterface02 {
    @Override
    public void A() {
        System.out.println("重写了MyInterface01接口的A方法");
    }

    @Override
    public void aaa() {
        System.out.println("接口中重复的抽象方法只需要覆盖重写一次即可");
    }

    @Override
    public void method01() {
        System.out.println("重写冲突的默认方法");
    }

    @Override
    public void B() {
        System.out.println("重写了MyInterface01接口的B方法");
    }
}
