package cn.jiahui.IO;

import java.io.*;

/**
 * 文件字符输出流
 * */
public class writeZiFuLiu {
    public static void main(String[] args) {
        //创建源
        File file = new File("test.txt");
        //选择流
        Writer write = null;
        //输出操作
        try {
            write = new FileWriter(file);
            //写法一：
//            String msg = "IO is hh";
//            char[] datas = msg.toCharArray();//字符串—>字符数组
//            write.write(datas,0,datas.length);

            //写法二：
//            String msg = "IO is beautiful";
//            write.write(msg);

            //写法三：
            write.append("IO is ..").append("北京");
            write.flush();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(write!=null){
                    write.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
