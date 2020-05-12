package cn.jiahui.homework.Test2;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Student st1 = new Student(),st2 = new Student(),st3 = new Student();
        try {
            st1.setNum("12245");
        }catch (Exception e){
            System.out.println(e.toString());
        }
        try {
            st2.setNum("4782367832");
        }catch (Exception e){
            System.out.println(e.toString());
        }
        try {
            st3.setNum("111111");
        }catch (Exception e){
            System.out.println(e.toString());
        }

    }
}
