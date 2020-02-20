package com.jiahui.JAVA;

public class Javastudy {
    public static void main(String[] args){
        System.out.println("24 赵袁嘉慧");
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i + "=" + i * j+" ");
            }
            System.out.println();
        }
    }
}
