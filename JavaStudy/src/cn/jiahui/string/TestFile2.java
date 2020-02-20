package cn.jiahui.string;

import java.io.File;

public class TestFile2 {
    public static void main(String[] args){
        File f = new File("D:\\算法练习");
        printFile(f,0);

    }

    static void printFile(File file,int level){

        for(int i=0;i<level;i++){
            System.out.print("-");
        }
        System.out.println(file.getName());
        if(file.isDirectory()){  //判断是否是文件
            File[] files = file.listFiles();  //定义数组存储文件目录树
            for(File temp:files){  //遍历输出
                printFile(temp,level+1);
            }
        }
    }
}
