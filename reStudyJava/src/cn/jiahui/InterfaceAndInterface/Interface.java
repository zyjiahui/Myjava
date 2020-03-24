package cn.jiahui.InterfaceAndInterface;

public interface  Interface extends InterfaceA,InterfaceB {
    public abstract void C();


    @Override
    public default void DefaultA() {
        System.out.println("重写冲突的默认方法");
    }
}
