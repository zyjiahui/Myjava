package com.jiahui.JAVA;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("输入两个正整数：");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = 0;
        int max = 0,min = 0;
        int p = a*b;
        if(a<b){
            int temp = a;a = b;b = temp;
        }
        c = a%b;
        while(c!=0){
            a = b;b = c;c = a%b;
        }
        max = b;min = p/max;
        System.out.println("最大公约数是："+max+"最小公倍数是："+min);
    }
}
