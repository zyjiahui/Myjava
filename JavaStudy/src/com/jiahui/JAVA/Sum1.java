package com.jiahui.JAVA;

public class Sum1 {
    public static void main(String[] args){
        double t = 1.0;
        double sum = 0;double m = 0;
        int i = 1;
        while (i<=20){
            m = t/jiecheng(i);
            sum+=m;
            i++;
        }
        System.out.println("前20项之和为："+sum);

    }
    public static int jiecheng(int n){
        int p = 1;
        for(int i=1;i<=n;i++){
            p*=i;
        }
        return p;
    }
}
