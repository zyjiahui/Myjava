package cn.jiahui.IO;

import java.io.*;

public class IOTest03 {
    public static void main(String[] args){
        //创建源
        File src = new File("aa.txt");
        //选择流
        InputStream is = null;
        //操作（读取）
        try{
            is = new FileInputStream(src);
            int temp;
            while ((temp=is.read())!=-1){
                System.out.println((char)temp);
            }
            //释放资源
            is.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(is!=null){
                    is.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
