package cn.jiahui.IO;

import java.io.File;

public class createFile {
    public static void main(String[] args) {
        String path="D:/MyJava/reStudyJava/testFile01.txt";
        //创建file对象
        //1、直接传路径
        File f1 = new File(path);
        System.out.println(f1.length());
        //2、父子构建
        f1 = new File("D:/MyJava/reStudyJava","testFile01.txt");
        System.out.println(f1.length());
        //3、父对象，子名称
        f1 = new File(new File("D:/MyJava/reStudyJava"),"testFile01.txt");
        System.out.println(f1.length());
    }
}
