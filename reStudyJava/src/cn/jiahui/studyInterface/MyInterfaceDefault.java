package cn.jiahui.studyInterface;
/**
 * 接口中定义默认方法
 *     public default 返回值类型 方法名称(参数列表){
 *         方法体
 *     }
 *
 * 备注：接口中的默认方法可以解决接口升级问题
 *
 * 1、接口的默认方法，可以通过接口实现类对象直接调用
 * 2、接口默认方法也可以被接口实现类进行覆盖
 *
 *
 *
 *
 * */
public interface MyInterfaceDefault {  //定义一个接口的方法
    //抽象方法
    public abstract void methodAbs();
    //新添加的抽象方法,实现类调用时不用重写该方法
    //public abstract void methodAbs01();
    //改为默认方法
    public default void methodDefault(){
        System.out.println("这是新添加的默认方法");
    }
}
