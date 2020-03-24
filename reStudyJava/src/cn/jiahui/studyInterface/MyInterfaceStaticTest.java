package cn.jiahui.studyInterface;
/**
 * 注意：不能通过接口实现类对象调用接口中的静态方法
 * 正确用法：通过接口名称直接调用其中的静态方法
 *     接口名称.静态方法名称(参数)
 * */
public class MyInterfaceStaticTest {
    public static void main(String[] args) {
        //创建了实现类对象
        MyInterfaceStatic01 m1 = new MyInterfaceStatic01();
        //错误写法,静态方法与对象无关，没有必要实例化一个对象来调用
        //m1.methodStatic();

        //直接通过接口名称调用静态方法,
        MyInterfaceStatic.methodStatic();

    }
}
