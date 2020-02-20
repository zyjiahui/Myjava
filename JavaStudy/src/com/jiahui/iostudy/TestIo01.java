package com.jiahui.iostudy;

import java.io.File;

public class TestIo01 {
    public static void main(String[] args){
        String path = "D:/IO/IOstudy/abc.txt";
        System.out.println(File.separatorChar);

        //建议写 /
        path = "D:/IO/IOstudy/abc.txt";
        System.out.println(path);
        //常量拼接
        path = "D:"+File.separator+"IO"+File.separator+"IOstudy"+File.separator+"abc.txt";
        System.out.println(path);

    }
}
