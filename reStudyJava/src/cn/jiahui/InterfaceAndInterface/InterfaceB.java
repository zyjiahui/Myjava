package cn.jiahui.InterfaceAndInterface;

public interface InterfaceB {
    public abstract void B();
    public abstract void method();
    public default void DefaultA(){
        System.out.println("默认方法02");
    }
}
