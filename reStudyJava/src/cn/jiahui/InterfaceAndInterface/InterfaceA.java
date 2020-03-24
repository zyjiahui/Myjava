package cn.jiahui.InterfaceAndInterface;

public interface InterfaceA {
    public abstract void A();
    public abstract void method();
    public default void DefaultA(){
        System.out.println("默认方法01");
    }
}
