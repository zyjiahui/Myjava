package cn.jiahui.IO;

import java.io.File;

/**
 * 1、相对路径和绝对路径
 *   存在盘符C D ：绝对路径
 *   不存在盘符：相对路径
 *  File可以构建一个不存在的文件
 *
 * */
public class addressFile {
    public static void main(String[] args) {
        String path="D:/MyJava/reStudyJava/testFile01.txt";
        //绝对路径
        File f = new File(path);
        System.out.println(f.getAbsolutePath());
        //相对路径
        System.out.println(System.getProperty("user.dir"));
        f = new File("testFile01.txt");
        System.out.println(f.getAbsolutePath());

        //构建一个不存在的文件
        f = new File("aaa/testFile01.txt");
        System.out.println(f.getAbsolutePath());
    }
}
