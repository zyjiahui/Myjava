package cn.jiahui.IO;
/**
 * 递归：方法自己调用自己
 *  递归头：何时结束递归
 *  递归体：重复调用
 *
 * */
public class diguiBianli {
    public static void main(String[] args) {
        print(1);
    }
    //测试递归
    public static void print(int n){
        if(n>10){  //递归头
            return;
        }
        System.out.println(n);
        print(n+1);   //递归体
    }
}
