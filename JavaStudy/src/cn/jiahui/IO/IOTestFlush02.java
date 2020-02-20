package cn.jiahui.IO;

import java.io.*;

public class IOTestFlush02 {
    public static void main(String[] args){
        //创建源
        File src = new File("aa.txt");
        //选择流
        InputStream is = null;
        try {
            is = new FileInputStream(src);
            //操作（分段读取）
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len=is.read())!=-1){
                String str = new String(flush,0,len);
                System.out.println(str);
            }
            //释放资源
            is.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
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
