package cn.jiahui.homework;

public class Min extends Max{
    int a;
    int b;
    public int f(int a,int b){
        int m=super.f(a, b);
        return (a*b)/m;   //返回最小公倍数
    }

}
