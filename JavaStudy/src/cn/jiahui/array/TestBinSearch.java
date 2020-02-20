package cn.jiahui.array;

import java.util.Arrays;

public class TestBinSearch {
    public static void main(String[] args){
        int[] a ={32,45,2,5,6,86,43,34};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int value = 32;
        System.out.println(value+"的索引值是："+myBinSearch(a,value));



    }
    public static int myBinSearch(int[] a,int value){
        int low = 0;
        int high = a.length-1;

        while (low<=high){
            int mid=(low+high);
            if(value==a[mid]){
                return mid;
            }
            if(value>a[mid]){
                low = mid+1;
            }
            if(value<a[mid]){
                high = mid-1;
            }
        }
        return -1;
    }
}
