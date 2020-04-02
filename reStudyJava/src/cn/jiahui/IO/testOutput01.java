package cn.jiahui.IO;

import java.io.*;

public class testOutput01 {
    public static void main(String[] args) {
        //创建源
        File file = new File("test.txt");
        //选择流
        OutputStream os = null;
        //写出操作
        try {
            os = new FileOutputStream(file,true);
            String mag = "my name is jiahui";  //写出的内容
            byte[] datas = mag.getBytes();  //存入数组，准备写出
            os.write(datas,0,datas.length);   //写出操作
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
