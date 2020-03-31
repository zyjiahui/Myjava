package cn.jiahui.IO;
/**
 *
 * 文件夹的length=0
 * */
import java.io.File;

public class wenjianjiaLength {
    public static void main(String[] args) {
        File file = new File("D:/MyJava/reStudyJava/testFile01.txt");
        count(file);
        System.out.println(len);
        System.out.println(file.getAbsolutePath());
    }
    private static int len;
    public static void count(File file){
        if(file!=null&&file.exists()){
            if(file.isFile()){
                len+=file.length();  //如果是文件夹则计算长度，如不是文件夹再往下层访问
            }else{
                for(File temp:file.listFiles()){
                    count(temp);
                }

            }
        }
    }
}
