package cn.jiahui.IO;

import java.io.*;

/**
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
            //操作：读
            int temp;
            while ((temp=is.read())!=-1){
                System.out.println((char) temp);
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
