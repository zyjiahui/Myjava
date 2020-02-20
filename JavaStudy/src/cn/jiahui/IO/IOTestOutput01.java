package cn.jiahui.IO;

import java.io.*;

/*
* 文件字节输出流
* 1、创建源
* 2、选择流
* 3、操作（写出）
* 4、释放资源
* */
public class IOTestOutput01 {
    public static void main(String[] args){
        //创建源
        File dest = new File("dest.txt");
        //选择流
        OutputStream os = null;
        try {
            os = new FileOutputStream(dest);
            //os = new FileOutputStream(dest,true);  //多次追加
            //操作
            String msg = "hello i am going to school";  //定义要写入的字符串
            //String msg = "hdfhsdcksfksk\r\n";//   \r\t为换行
            byte[] datas = msg.getBytes();  //字符串→字节数组（编码）
            os.write(datas,0,datas.length); //写入
            os.flush();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(os!=null){
                    os.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
