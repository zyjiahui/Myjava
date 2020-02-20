package com.jiahui.iostudy;

import java.io.File;

/*
* 列出下一级
* 1、list()：列出下级名称
* 2、listFile()：列出下级File对象
*
* 列出所有的盘符listRoot()
* */
public class TestDir {
    public static void main(String[] args){
        File dir = new File("D:/IO");//IO的下级名称：IOstudy，IOstudy1

        //列出下级名称
        String[] subNames = dir.list();
        for(String s:subNames){
            System.out.println(s);
        }


        //列出下级对象listFile
        File[] subFiles = dir.listFiles();
        for(File s:subFiles){
            System.out.println(s.getAbsolutePath());
        }

        //所有的盘符（C  D）
        File[] roots = dir.listRoots();
        for(File r:roots){
            System.out.println(r.getAbsolutePath());
        }
    }
}
