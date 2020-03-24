package cn.jiahui.studyInterface;
/**
 * 从Java8开始，接口中允许定义静态方法
 * 格式：
 *     public static 返回值类型 方法名称(参数列表){
 *         方法体
 *     }
 * 提示：就是将abstract或default换成static，带上方法体
 * */
public interface MyInterfaceStatic {
    public static void methodStatic(){
        System.out.println("这是一个静态方法");
    }
}
