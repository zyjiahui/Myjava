package cn.jiahui.rongqi;

import java.util.ArrayList;
import java.util.List;

public class Test02 {
    public static void main(String[] args){
        //test1();
        test2();


    }

    //关于集合的应用
    public static void test1(){
        List<String> l = new ArrayList<String>();
        l.add("aa");
        l.add("bb");
        l.add("cc");

        List<String> l1 = new ArrayList<String>();
        l1.add("aa");
        l1.add("dd");
        l1.add("ee");

        /*l.addAll(l1);
        System.out.println(l);

        l.removeAll(l1);
        System.out.println(l);*/

        l.retainAll(l1);
        System.out.println(l);
    }

    public static void test2(){
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("A");


        System.out.println(list);

        list.add(3,"jiahui");
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        list.set(2,"xiaoyue");
        System.out.println(list);


        System.out.println(list.indexOf("A"));
        System.out.println(list.lastIndexOf("A"));
    }


}
