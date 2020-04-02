package cn.jiahui.IO;

import java.io.*;

public class testOutput02 {
    public static void main(String[] args) {
        //创建源
        File file = new File("test.txt");
        //选择流
        OutputStream os = null;

        //写出操作
        try {
            os = new FileOutputStream(file);
            String msg = "hhhhhhhhhh";
            byte[] datas = msg.getBytes();
            os.write(datas,0,datas.length);
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
