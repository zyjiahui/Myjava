package cn.jiahui.IO;

import java.io.File;

public class diguiPrint {
    public static void main(String[] args) {
        File file = new File("D:/MyJava/reStudyJava");
        printName(file,0);
    }
    //递归输出子孙级目录和文件名
    public static void printName(File file,int deep){
        //控制层次感
        for(int i=0;i<deep;i++){
            System.out.print("*");
        }
        System.out.println(file.getName());
        if(null==file||!file.exists()){  //递归头
            return;
        }else if(file.isDirectory()){ //是目录
            for(File temp:file.listFiles()){
                printName(temp,deep+1);  //递归体
            }
        }
    }
}
