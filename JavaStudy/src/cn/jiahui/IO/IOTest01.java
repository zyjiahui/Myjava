package cn.jiahui.IO;

import java.io.*;

/*
* 第一个程序:文件字节输入流
* 1、创建源
* 2、选择流
* 3、操作
* 4、释放资源
* */
public class IOTest01 {
    public static void main(String[] args) throws IOException {
        //创建流
        File src = new File("aa.txt");//  jia
        //选择流
        InputStream is = new FileInputStream(src);
        //操作（读取）
        int data1 = is.read();
        int data2 = is.read();
        int data3 = is.read();
        int data4 = is.read();
        //释放资源
        is.close();
        System.out.println((char) data1);
        System.out.println((char) data2);
        System.out.println((char) data3);
        System.out.println(data4);
    }
}
