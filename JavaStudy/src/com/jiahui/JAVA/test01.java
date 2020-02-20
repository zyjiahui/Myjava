package com.jiahui.JAVA;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args){  //求最大公约数和最小公倍数
        Scanner in=new Scanner(System.in);
        System.out.println("输入两个数：");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=0;
        int max=0,min= 0;
        int y = a*b;
        if(b>a)
        {
            int t=b;b=a;a=t;
        }
        c=a%b;
        while(c!=0)
        {
            a=b;b=c;c=a%b;
        }
        max = b;min = y/max;
        System.out.println("最大公约数为:"+max+",最小公倍数为："+min);
    }


    }

