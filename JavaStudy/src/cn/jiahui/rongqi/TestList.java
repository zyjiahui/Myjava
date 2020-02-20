package cn.jiahui.rongqi;

import java.util.ArrayList;
import java.util.Collection;

public class TestList {
    public static void main(String[] args){
        Collection c = new ArrayList();
        System.out.println(c.size());
        System.out.println(c.isEmpty());

        c.add("嘉慧");
        c.add("嘉慧1");
        System.out.println(c);
        System.out.println(c.size());

        System.out.println(c.contains("嘉慧3"));

        Object[] objs = c.toArray();
        System.out.println(objs);

        c.remove("嘉慧1");
        System.out.println(c);
        c.clear();
        System.out.println(c.size());

    }
}
