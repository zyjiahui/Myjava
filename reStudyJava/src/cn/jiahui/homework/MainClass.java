package cn.jiahui.homework;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aaaa");  //链表
        //arrayList.add(1);
        for(int i=0;i<arrayList.size();i++){
            String item = arrayList.get(i);
            System.out.println("泛型测试"+"item = "+item);
        }
    }
}
