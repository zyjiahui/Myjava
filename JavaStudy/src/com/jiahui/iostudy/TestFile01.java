package com.jiahui.iostudy;

import java.io.File;

public class TestFile01 {
    public static void main(String[] args){
        String path = "D:/IO/IOstudy/abc.txt";

        //构建File对象,三种构造方法
        //1.直接是File对象的名字
        File src = new File(path);
        System.out.println(src.length());
        //2.父子构建
        src = new File("D:/IO/IOstudy","abc.txt");
        System.out.println(src.length());
        //3.父对象子名称
        src = new File(new File("D:/IO/IOstudy"),"abc.txt");
        System.out.println(src.length());


    }
}
