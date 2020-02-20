package cn.jiahui.string;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args){
        //获得日期的相关元素
        Calendar calendar = new GregorianCalendar(2343,10,06,15,30);
        System.out.println(calendar);

        int month = calendar.get(Calendar.MONTH);
        System.out.println(month);

        int weekday = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(weekday);

        //设置日期的相关元素
        Calendar c1 = new GregorianCalendar();
        c1.set(Calendar.YEAR,3000);
        c1.set(Calendar.MONTH,4);
        System.out.println(c1);

        //日期的计算
        Calendar c2 = new GregorianCalendar(),c3 = new GregorianCalendar();
        c2.add(Calendar.YEAR,100);
        c3.add(Calendar.YEAR,-200);
        System.out.println(c2);
        System.out.println(c3);

        //日期对象和时间对象的转换
        Date d4 = c2.getTime();
        Calendar c4 = new GregorianCalendar();
        c4.setTime(new Date());
    }
}
