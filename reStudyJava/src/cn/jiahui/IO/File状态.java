package cn.jiahui.IO;

import java.io.File;

/**
 * 文件状态：
 *    1、不存在  exists
 *    2、存在：  文件：isFile
 *               文件夹：isDirctory
 *
 * */
public class File状态 {
    public static void main(String[] args) {
        File f = new File("testFile01.txt");
        System.out.println("是否存在："+f.exists());
        System.out.println("是否是文件："+f.isFile());
        System.out.println("是否是文件夹："+f.isDirectory());

        System.out.println("___________________________________________");
        f = new File("D:/MyJava/reStudyJava");
        System.out.println("是否存在："+f.exists());
        System.out.println("是否是文件："+f.isFile());
        System.out.println("是否是文件夹："+f.isDirectory());


    }
}
