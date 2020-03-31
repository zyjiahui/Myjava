package cn.jiahui.IO;

import java.io.File;

/**
 * 名称或路径
 *   getName()，名称
 *   getPath()，相对或绝对路径
 *   getAbsolutePath(),  绝对路径
 *   getParent()  上级路径，没有返回null
 *
 *
 * */
public class File方法 {
    public static void main(String[] args) {
        File f = new File("D:/MyJava/reStudyJava/testFile01.txt");
        System.out.println("名称："+f.getName());
        System.out.println("路径："+f.getPath());  //根据path判断返回绝对路径
        System.out.println("绝对路径："+f.getAbsolutePath());//总是返回绝对路径
        System.out.println("父路径："+f.getParent());  //返回父路径
        System.out.println("父对象："+f.getParentFile().getName());
    }
}
