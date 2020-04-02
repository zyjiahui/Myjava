package cn.jiahui.IO;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        copy("github.jpg","copy01.jpg");
    }
    public static void copy(String yuanPath,String midiPath){
        //创建源
        File file1 = new File(yuanPath);//拷贝的源头
        File file2 = new File(midiPath);//拷贝的目的地
        //选择流
        InputStream is = null;
        OutputStream os = null;
        //读和写操作
        try {
            is = new FileInputStream(file1);
            os = new FileOutputStream(file2);
            //读入
            byte[] data1 = new byte[1024];
            int len = -1;
            while ((len = is.read(data1))!=-1){
                os.write(data1,0,len);
            }
            //写出

            os.flush();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //释放资源，先打开的后关闭
            try {
                if(os!=null){
                    os.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
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
