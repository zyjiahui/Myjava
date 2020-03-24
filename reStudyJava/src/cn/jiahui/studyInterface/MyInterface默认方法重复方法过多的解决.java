package cn.jiahui.studyInterface;
/**
 * 为了防止实现类调用共有代码方法，应该私有化共有代码方法
 *解决方法：从Java9开始，接口中允许定义私有方法
 *     1、普通私有方法：解决多个默认方法之间重复代码问题
 *     格式：
 *         private 返回值类型 方法名称(参数列表){
 *             方法体
 *         }
 *     2、静态私有方法：解决多个静态方法之间重复代码问题
 *     格式：
 *         private static 返回值类型 方法名称(参数列表){
 *             方法体
 *         }
 * */
public interface MyInterface默认方法重复方法过多的解决 {
    //定义了两个默认方法，但是其中重复代码过多，
    //又定义了一个默认方法用来写重复的代码，具有重复代码的方法直接调用
    //但是这样一来，自定义的共有代码方法可以被实现类所调用，这样不理想

    /*public default void methodDefault01(){
        System.out.println("默认方法1");
        reMethod();
    }
    public default void methodDefault02(){
        System.out.println("默认方法2");
        reMethod();
    }
    public default void reMethod(){
        System.out.println("aaa");
        System.out.println("bbb");
        System.out.println("ccc");
    }*/

    public default void methodDefault01(){
        System.out.println("默认方法1");
        reMethod();
    }
    public default void methodDefault02(){
        System.out.println("默认方法2");
        reMethod();
    }
    private void reMethod(){
        System.out.println("aaa");
        System.out.println("bbb");
        System.out.println("ccc");
    }


}
