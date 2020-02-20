package cn.jiahui.baozhuang;

import javax.print.DocFlavor;

public class TestWrappedClass {
    public static void main(String[] args){
        //基本数据类型转化为包装类对象
        Integer a = new Integer(3);
        Integer b = Integer.valueOf(3);

        //把包装类对象转成基本数据类型
        int c = b.intValue();
        double d = b.doubleValue();

        //字符串转成包装类对象
        Integer e = new Integer("9999");
        //Integer f = new Integer.parseInt("975983478");

        //String str = f.toString();
    }
}
