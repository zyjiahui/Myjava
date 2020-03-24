package cn.jiahui.studyInterface;

public interface MyInterface静态方法重复方法过多的解决 {

    public static void methodStatic01(){
        System.out.println("静态方法1");
        reMethod1();
    }
    public static void methodStatic02(){
        System.out.println("静态方法2");
        reMethod1();
    }
    private static void reMethod1(){
        System.out.println("aaa");
        System.out.println("bbb");
        System.out.println("ccc");
    }


}
