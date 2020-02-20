package cn.jiahui.IO;
/*
* 标准
* 1、创建源
* 2、选择流
* 3、操作（读取）
* 4、释放资源
* */
import java.io.*;

public class IOTest02 {
    public static void main(String[] args) {
        //创建流
        File src = new File("aa.txt");//  jia
        //选择流
        InputStream is = null;
        try {
            is = new FileInputStream(src);
            //操作（读取）
            int temp;
            while ((temp = is.read()) != -1) {  //读取read
                System.out.println((char) temp);
            }
            //释放资源
            is.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(null!=is){
                    is.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
