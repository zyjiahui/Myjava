package cn.jiahui.IO;

import java.io.File;

/**
 * 列出下一级：
 *     1、list() :列出下级名称
 *     2、listFile() :列出下级File对象
 *     3、listRoot() :列出所有的盘符
 *
 * */
public class nextFile {
    public static void main(String[] args) {
        File f = new File("D:/MyJava/reStudyJava");
        //输出下级名称
        String[] names = f.list();
        for(String temp:names){
            System.out.println(temp);
        }

        //输出下级对象
        File[] Filenames = f.listFiles();
        for(File temp1:Filenames){
            System.out.println(temp1.getAbsolutePath());
        }

        //列出所有的盘符
        File[] roots = f.listRoots();
        for(File r:roots){
            System.out.println(r.getAbsolutePath());
        }
    }
}
