package cn.jiahui.IO;

import java.io.*;

/**
 * 字节流
 * 读操作：1、创建源
 *         2、选择流
 *         3、读操作
 *         4、释放资源
 * */
public class inputStream {
    public static void main(String[] args) throws IOException {
        //创建源
        File file = new File("aaa.txt");
        //选择流
        InputStream is = null;
        try {
            is= new FileInputStream(file);  //***************
            //操作：读  (分段读取)
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len=is.read(flush))!=-1){
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
                if(is!=null){
                    is.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }

        }



    }
}
