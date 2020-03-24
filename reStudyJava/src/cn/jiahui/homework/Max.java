package cn.jiahui.homework;

public class Max {
    int a;
    int b;
    public int f(int a,int b){
        if(a<b){
            int temp = a;
            a = b;
            b = temp;
        }
        while(b!=0){
            int m = a%b;
            a = b;
            b = m;
        }
        return a;   //返回最大公约数
    }
}
