package cn.jiahui.IO;

import java.io.*;

/*
* 文件的拷贝：文件字节的输入和输出流
* */
public class IOTestCopyFile01 {
    public static void main(String[] args){
        //创建源，输入和输出源
        File src = new File("cxy.png");  //源头
        File dest = new File("cxycopy.png");  //目的地
        //选择流，输入流和输出流
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(src);
            os = new FileOutputStream(dest);
            //操作（分段读取）
            byte[] flush = new byte[1024];  //缓冲器，每次读多少个字节
            int len = -1;//接收长度
            while ((len=is.read(flush))!=-1){
                os.write(flush,0,len);
            }
            os.flush();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //释放资源，分别关闭两个流，先打开的后关闭
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
