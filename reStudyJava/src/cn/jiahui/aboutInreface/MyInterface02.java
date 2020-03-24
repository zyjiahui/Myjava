package cn.jiahui.aboutInreface;

public interface MyInterface02 {
    public abstract void B();
    public abstract void aaa();
    public default void method01(){
        System.out.println("默认方法02");
    }
}
