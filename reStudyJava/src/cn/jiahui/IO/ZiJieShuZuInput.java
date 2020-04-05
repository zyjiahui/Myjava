package cn.jiahui.IO;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 字节数组输入流
 * 1、创建源：字节数组，不要太大
 * 2、选择流
 * 3、操作
 * 4、释放资源：可以不用释放
 * */
public class ZiJieShuZuInput {
    public static void main(String[] args) {
        //创建源
        byte[] src = "haha is happy".getBytes();
        //选择流
        InputStream is = null;
        try {
            is =new ByteArrayInputStream(src);
            //操作
            byte[] datas = new byte[5];
            int len = -1;
            while ((len = is.read(datas))!=-1){
                String str = new String(datas);
                System.out.println(str);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
//            try {
//                if(is!=null){
//                    is.close();
//                }
//            }catch (IOException e){
//                e.printStackTrace();
//            }
        }
    }
}
