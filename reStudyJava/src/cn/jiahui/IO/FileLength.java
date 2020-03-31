package cn.jiahui.IO;

/**
 * length(),  文件的字节数，不是文件或不存在的话，长度为0
 * */
import java.io.File;

public class FileLength {
    public static void main(String[] args) {
        File f = new File("D:/MyJava/reStudyJava/testFile01.txt");
        System.out.println("长度："+f.length());

        f = new File("D:/MyJava/reStudyJava");
        System.out.println("长度："+f.length());

        f = new File("D:/MyJava/reStudyJava01");
        System.out.println("长度："+f.length());

    }
}
