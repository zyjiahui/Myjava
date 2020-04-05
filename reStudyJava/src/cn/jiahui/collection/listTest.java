package cn.jiahui.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * java.util.list接口继承collectionjiekou
 * List接口的特点：
 *    1、有序的集合，存储元素和取出的元素顺序一致
 *    2、有索引，包含一些带索引的方法
 *    3、允许有重复的元素
 * List接口中带索引的方法（特有）
 *     1、public void add(int index,E element):指定的元素，添加到该集合中的指定位置
 *     2、public E get(int index)：返回集合中指定位置的元素
 *     3、public E remove(int index):移除列表中指定位置的元素，返回的是被移除的元素
 *     4、public E set(int remove,E element):用指定元素替换集合中指定位置，返回值的更新前的元素
 *
 *     一定要注意：操作索引时的越界异常
 *
 *
 * */
public class listTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);


        //添加元素1、 public void add(int index,E element):指定的元素，添加到该集合中的指定位置
        list.add(3,"jiahui");
        System.out.println(list);




        //移除元素3、public E remove(int index):移除列表中指定位置的元素，返回的是被移除的元素
        String removeE = list.remove(4);//返回的是移除的元素
        System.out.println("移除元素:"+removeE);
        System.out.println(list);
        //替换4、public E set(int remove,E element):用指定元素替换集合中指定位置，返回值的更新前的元素
        String setE = list.set(4,"A");
        System.out.println("被替换的："+setE);
        System.out.println(list);

        //2、public E get(int index)：返回集合中指定位置的元素
        //List集合的遍历
        //1、普通for循环
        for(int i=0;i<list.size();i++){
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("__________________________-");
        //2.迭代器遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("_________________________");
        //3、使用增强for
        for(String s:list){
            System.out.println(s);
        }
    }
}
