package cn.jiahui.aboutInreface;

public class TestFatherSon {
    public static void main(String[] args) {
        Son s = new Son();
        s.F();   //Son继承了Father类，实现了SonInterface接口，如果父类和接口的默认方法冲突时，优先选择调用父类的方法
    }
}
