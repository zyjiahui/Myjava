package cn.jiahui.aboutInreface;

public interface MyInterface01 {
    public abstract void A();
    public abstract void aaa();
    public default void method01(){
        System.out.println("默认方法01");
    }
}
