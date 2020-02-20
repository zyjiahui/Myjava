package cn.jiahui.IO;

import java.io.*;

public class IOTestOutput02 {
    public static void main(String[] args){
        //创建源
        File text = new File("text.txt");
        //选择流
        OutputStream os = null;
        try {
            os = new FileOutputStream(text);
            //操作（写入）
            String str = "my name is jiahui";
            byte[] datas = str.getBytes();
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
