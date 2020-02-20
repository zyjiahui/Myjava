package cn.jiahui.string;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) throws IOException {
        //File f = new File("d:/a.txt");
        File f = new File("d:\\a.txt");
        System.out.println(f);
        f.renameTo(new File("d:/bb.txt"));//改变名字

        System.out.println(System.getProperty("user.dir"));//所在文件的路径

        File f2 = new File("aa.txt");
        f2.createNewFile();
    }
}
