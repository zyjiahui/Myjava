package cn.jiahui.jiekou;

public class TestString {
    public static void main(String[] args){
        String str = "abc";
        String str2 = new String("dedsf");
        String str3 = "abc"+"bced";
        String str4 = "23"+45;//只要其中有一个是字符串，两个相接组成的就是字符串
        System.out.println(str4);
        System.out.println("**********************************");

        String str5 = "123";
        String str6 = "123";
        String str7 = new String("123");//新建的一个对象

        System.out.println(str5 == str6);//都在常量池，是同一个对象
        System.out.println(str6 == str7);
        System.out.println(str6.equals(str7));//一般比较时用equals，只比较内容是否相等
    }
}
