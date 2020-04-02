package cn.jiahui.IO;

import java.io.*;

/**
 * 文件字符流输入
 * 步骤：
 * 1、创建源
 * 2、选择流
 * 3、操作
 * 4、释放资源
 *
 * */
public class readZiFuLiu {
    public static void main(String[] args) {
        //创建源
        File file = new File("aaa.txt");
        //选择流
        Reader reader = null;
        try {
            reader= new FileReader(file);  //***************
            //操作：读  (分段读取)
            char[] flush = new char[1024];
            int len = -1;
            while ((len=reader.read(flush))!=-1){
                //字符数组—>字符串
                String str = new String(flush,0,len);
                System.out.println(str);
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //释放资源
            try {
                if(reader!=null){
                    reader.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }

        }
    }
}
