package com.jiahui.iostudy;

import java.io.UnsupportedEncodingException;

/*
* 解码：字节——字符串
* */
public class TestContentDecode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg = "性命生命使命";
        byte[] datas = msg.getBytes();
        //解码：字符串

        msg = new String(datas,0,datas.length,"utf8");
        System.out.println(msg);

        //乱码：
        //字节数不够
        msg = new String(datas,0,datas.length-2,"utf8");
        System.out.println(msg);


        //字符集不统一
        msg = new String(datas,0,datas.length,"gbk");
        System.out.println(msg);

    }
}
