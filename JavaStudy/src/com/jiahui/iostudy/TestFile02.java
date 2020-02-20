package com.jiahui.iostudy;

import java.io.File;

public class TestFile02 {
    public static void main(String[] args){
        //相对路径和绝对路径
        //（1）存在盘符：绝对路径
        //（2）不存在盘符：相对路径

        String path = "D:/IO/IOstudy/abc.txt";

        //绝对路径
        File src = new File(path);
        System.out.println(src.getAbsolutePath());


        System.out.println(System.getProperty("user.dir"));

        //相对路径
        src = new File("abc.txt");
        System.out.println(src.getAbsolutePath());

        //构建一个不存在的文件
        src = new File("D:dsas.tet");
        System.out.println(src.getAbsolutePath());
    }
}
