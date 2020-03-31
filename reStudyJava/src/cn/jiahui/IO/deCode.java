package cn.jiahui.IO;

import java.io.UnsupportedEncodingException;

/**
 * 解码：字节——>字符串
 *
 * */
public class deCode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg = "性命生命使命";
        //编码：为字节数字
        byte[] datas = msg.getBytes();
        //解码：为字符串
        msg = new String(datas,0,datas.length,"utf-8");
        System.out.println(msg);

        //还原为字符时，可能的乱码问题
        //1、字节数不够
        msg = new String(datas,0,datas.length-2,"utf8");
        System.out.println(msg);
        //2、字符集不统一
        msg = new String(datas,0,datas.length-2,"gbk");
        System.out.println(msg);
    }
}
