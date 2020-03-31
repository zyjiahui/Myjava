package cn.jiahui.IO;

import java.io.File;

/**
 * 使用面向对象统计文件夹的大小
 *
 * */
public class DirCount {
    //大小
    private long len;
    //文件夹的大小
    private String path;
    //文件源
    private File file;
    //文件夹的个数
    private int dirNum;
    //文件的个数
    private int fileNum;
    public DirCount(String path){  //构造函数
        this.path = path;
        this.file = new File(path);
        count(this.file);
    }

    public long getLen() {
        return len;
    }

    public int getFileNum() {
        return fileNum;
    }

    public int getDirNum() {
        return dirNum;
    }

    //统计大小
    private void count(File file){
        if(file!=null&&file.exists()){
            if(file.isFile()){  //如果是文件
                len+=file.length();
                this.fileNum++;
            }else {
                this.dirNum++;
                for(File temp:file.listFiles()){  //如果是文件夹
                    count(temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        DirCount dir = new DirCount("D:/MyJava/reStudyJava/testFile01.txt");
        System.out.println(dir.getLen());
        DirCount dir1 = new DirCount("D:/MyJava/reStudyJava");
        System.out.println("文件的个数："+dir1.fileNum);
        DirCount dir2 = new DirCount("D:/MyJava");
        System.out.println("文件夹的个数："+dir2.dirNum);

    }

}
