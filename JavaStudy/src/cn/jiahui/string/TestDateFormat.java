package cn.jiahui.string;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
    public static void main(String[] args) throws ParseException {
        //把时间转为字符串
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        String str =  df.format(new Date(4000000));
        System.out.println(str);

        //把字符串转为相应的时间对象
        DateFormat df1 = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
        Date date = df1.parse("2000年4月8日 11时05分00秒");
        System.out.println(date);

        //察看今天是今年的第几天
        DateFormat df2 = new SimpleDateFormat("D");
        String str2 =  df2.format(new Date());
        System.out.println(str2);
    }
}
