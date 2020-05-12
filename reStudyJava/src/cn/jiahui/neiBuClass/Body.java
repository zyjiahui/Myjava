package cn.jiahui.neiBuClass;
/**
 * 内用外：随意访问，外用内：需要内部类对象
 *
 * */
public class Body {  //外部类
    public class Heart{  //内部类
        public void beat(){
            System.out.println("心脏跳动");
            System.out.println(name);
        }
    }
    private String name; //外部类的成员变量，
    public void methodBody(){
        System.out.println("外部类的方法");
    }
}
