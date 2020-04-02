package cn.jiahui.IO;

import java.io.*;

/**
 * 写出内容：字节流
 * 1、创建源
 * 2、选择流
 * 3、写出操作
 * 4、释放资源
 *
 * */
public class testOutputStream {
    public static void main(String[] args) {
        //1、创建yuan
        File file = new File("test.txt");//outputStream中，该文件可以不存在，会自动创建
        //选择流
        OutputStream os = null;
        //写出操作
        try {
            os = new FileOutputStream(file,false); //该函数可以进行追加，true追加，false不会追加
            String msg = "IO is so easy";
            byte[] datas = msg.getBytes();  //字符床-->字节数组（编码）
            os.write(datas,0,datas.length);
            os.flush();  //刷新输出流，避免数据驻留在内存中
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //释放资源
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
