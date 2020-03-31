package cn.jiahui.IO;

import java.io.UnsupportedEncodingException;

/**
 * 编码：字符——>字节
 *
 * */
public class enCode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg = "性命生命使命";
        byte[] datas = msg.getBytes();//编码，储存在datas数组中  默认字符集为工程字符集
        System.out.println(datas.length);

        //编码其他字符集
        datas = msg.getBytes("UTF-16LE");  //定义的字符集,小端表示，每个都占两个字节
        System.out.println(datas.length);
        datas = msg.getBytes("GBK");
        System.out.println(datas.length);
    }
}
