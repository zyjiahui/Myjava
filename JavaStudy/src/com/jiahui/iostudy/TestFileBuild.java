package com.jiahui.iostudy;

import java.io.File;

/*
* 创建目录
* 1、mkdir():确保上级目录的存在，不存在创建失败
* 2、mkdirs():上级目录可以不存在，不存在一同来创建
* */
public class TestFileBuild {
    public static void main(String[] args){
        File dir = new File("D:/IO/IOstudy/src/test");//src不存在，相当于test的上级不存在，mkdir为false，mkdirs为true
        //创建目录推荐使用mkdirs()
        //boolean flag = dir.mkdir();
        //System.out.println(flag);

        boolean flag1 = dir.mkdirs();
        System.out.println(flag1);

        /*File f = new File("D:/IO/IOstudy/test");
        boolean flag = f.mkdir();
        System.out.println(flag);*/
    }
}
