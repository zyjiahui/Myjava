package cn.jiahui.studyInterface;

public class MyInterface重复静态方法解决示例 {
    public static void main(String[] args) {
        MyInterface静态方法重复方法过多的解决.methodStatic01();
        MyInterface静态方法重复方法过多的解决.methodStatic02();
        //错误写法，私有化后的静态方法不能被访问
        //MyInterface静态方法重复方法过多的解决.reMethod1();
    }
}
