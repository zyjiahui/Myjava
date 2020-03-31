package cn.jiahui.IO;

import java.io.File;

/**
 * 创建目录：
 *     1、mkdir():确保上级目录存在，不存在创建失败
 *     2、mkdirs():上级目录可以不存在，若不存在，帮忙创建
 *
 * */
public class creatDir {
    public static void main(String[] args) {
        File file = new File("D:/MyJava/reStudyJava/IOFile/io.txt");
        boolean flag = file.mkdir();
        System.out.println(flag);//上级目录IOFile不存在，创建失败
        boolean flag1 = file.mkdirs();
        System.out.println(flag1);//创建成功，上级目录一同创建
    }
}
