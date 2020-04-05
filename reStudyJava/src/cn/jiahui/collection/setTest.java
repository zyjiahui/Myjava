package cn.jiahui.collection;

import java.net.SocketOption;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * java.util.Set接口 继承Collection接口
 * Set接口的特点：
 *     1、不允许存储重复的元素
 *     2、没有索引，没有索引的方法，也不能使用普通for循环遍历
 *
 * java.util.HashMap集合 implements（实现）Set接口
 *     HashMap的特点：
 *     1、不允许存储重复的元素，
 *     2、没有索引，没有索引的方法，也不能使用普通for循环遍历
 *     3、是一个无序的集合，存储元素和取出元素的顺序可能不同
 *     4、底层是一个哈希表的结构，（查询的速度非常快）
 *
 * */
public class setTest {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //使用add往集合中添加元素
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        System.out.println(set);

        //遍历（不能使用普通的for循环遍历）
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            Integer n = it.next();
            System.out.println(n);
        }

        System.out.println("-----------------------------------------------");
        //foreach循环
        for(Integer i:set){
            System.out.println(i);
        }
    }
}
