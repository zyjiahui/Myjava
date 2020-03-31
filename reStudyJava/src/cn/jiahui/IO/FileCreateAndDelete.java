package cn.jiahui.IO;

import java.io.File;
import java.io.IOException;

/**
 * 创建文件：creatNewFile()；不存在的话创建，存在的话不再创建
 * 删除文件;delete()
 *
 * */
public class FileCreateAndDelete {
    public static void main(String[] args) throws IOException {
        File f = new File("D:/MyJava/reStudyJava/aaa.txt");
        boolean flag = f.createNewFile();  //创建文件，可能创建不成功，要抛出异常
        System.out.println(flag);
        //如果再刷新一次，显示false，因为不能重复创建


        //检测是否可以创建文件夹,返回true，但创建的并不是文件夹
        f = new File("D:/MyJava/reStudyJava01");//新的文件夹
        boolean flag2 = f.createNewFile();
        System.out.println(flag2);
        f.delete();

        //补充：con com3 为操作系统的设备名，不能创建为文件名
        File f1 = new File("D:/MyJava/reStudyJava/com3");
        boolean flag3 = f1.createNewFile();
        System.out.println(flag3);

    }
}
