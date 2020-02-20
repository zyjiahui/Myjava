package cn.jiahui.array;

import java.sql.Array;
import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args){
        int[] a={1,2,3,4};
        System.out.println(a);//只说明是数组和位置
        System.out.println(Arrays.toString(a));//可以输出数组的内容

        //数组的排序
        int[] b={34,45,6,12,675};
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

        //数组的二分查找
        System.out.println(Arrays.binarySearch(b,12));
        System.out.println(Arrays.binarySearch(a,3));
        System.out.println(Arrays.binarySearch(a,12));//若找到返回该数，若没有找到返回一个负数
    }
}
