package cn.jiahui.IO;

import java.io.*;

/**
 *
 *两步：
 * 1、图片读取到字节数组中
 * 2、字节数组写出到文件
 *
 */

public class FileToByteArrayAndByteArrayToFile {
    public static void main(String[] args) {
        //图片转成字节数组
        byte[] datas = fileToByteArray("github.jpg");
        System.out.println(datas.length);
        byteArrayToFile(datas,"returnGithub.jpg");
    }
    //两个函数
    //1、图片到字节数组中
    //   (1),图片到程序  FileInputStream  读取
    //   (2),程序到字节数组 ByteArrayOutputStream
    //
    public static byte[] fileToByteArray(String filePath){
        //创建源
        File src = new File(filePath);
        byte[] dest = null;
        //选择流
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            is = new FileInputStream(src);
            baos = new ByteArrayOutputStream();
            //操作：（分段读取）
            byte[] flush = new byte[1024*10];
            int len = -1;
            while ((len = is.read(flush))!=-1){
                baos.write(flush,0,len);//写出到字节数组中
            }
            baos.flush();
            return baos.toByteArray();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
    //1、字节数组写出到图片
    //   (1),字节数组到程序  ByteArrayInPutStream
    //   (2),程序到文件  FileOutPutStream
    public static void byteArrayToFile(byte[] src,String filePath){
        //创建源
        File dest = new File(filePath);//目的地
        //选择流
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new ByteArrayInputStream(src);
            os = new FileOutputStream(dest);
            byte[] flush = new byte[5];
            int len = -1;
            while ((len = is.read(flush))!=-1){
                os.write(flush,0,len);
            }
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
