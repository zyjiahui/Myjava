package cn.jiahui.studyInterface;
/**
 * 接口中也可以定义“成员变量”，但必须用public static final三个关键字修饰（可省略）
 *从效果上看，就是接口的常量，
 * 格式：
 *     public static final 数据类型 常量名称 = 数据值
 * 备注：一旦使用final关键字，说明不可改变
 * 注意：接口中的变量必须进行赋值，不能不赋值，否则报错为0，永远为0
 *     接口中常量的名称必须是全大写，多个用下划线分割
 * */
public interface InterfaceConst {
    //接口中这就是一个常量，一旦赋值不能修改
    public static final int NUM_OF_CLASS = 10;
}
