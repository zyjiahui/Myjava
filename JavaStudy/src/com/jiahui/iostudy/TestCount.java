package com.jiahui.iostudy;

import java.io.File;

public class TestCount {
    //大小
    private long len;
    //文件夹
    private String path;
    //源
    private File src;


    public TestCount(String path){
        this.path = path;
        this.src = new File(path);
        count(this.src);
    }

    public static void main(String[] args){
        TestCount dir = new TestCount("D:/IO/IOstudy1");

    }


    private void count(File src){   //计算文件大小的方法


        if(src.isFile()){    //如果是文件，大小等于初始大小加上文件的大小
            len+=src.length();
        }else {
            for(File s:src.listFiles()){  //否则遍历文件子孙级，递归
                count(s);
            }
        }
    }
    

}
