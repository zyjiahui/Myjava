package com.jiahui.iostudy;

import java.io.File;

public class TestFile03 {
    public static void main(String[] args){
        File src = new File("D:/IO/IOstudy");  //创建一个文件

        count(src);  //调用计算文件大小的方法
        System.out.println(len);  //输出文件大大小
    }

    private static long len = 0;  //初始化文件开始的长度
    public static void count(File src){   //计算文件大小的方法


        if(src.isFile()){    //如果是文件，大小等于初始大小加上文件的大小
            len+=src.length();
        }else {
            for(File s:src.listFiles()){  //否则遍历文件子孙级，递归
                count(s);
            }
        }


    }
}
