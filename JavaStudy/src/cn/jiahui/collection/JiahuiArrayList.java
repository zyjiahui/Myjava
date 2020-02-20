package cn.jiahui.collection;

public class JiahuiArrayList {
    private Object[] elementData;
    private int size;

    private static final int DEFAULT_CAPACITY = 10;

    public JiahuiArrayList(int capacity){
        elementData = new Object[capacity];
    }

    public void add(Object obj){
        elementData[size++] = obj;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        /*for(Object obj:elementData){
            sb.append(obj);
        }*/
        for(int i=0;i<size;i++){
            sb.append(elementData[i]+",");
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }

    public static void main(String[] args){
        JiahuiArrayList s1 = new JiahuiArrayList(20);
        s1.add("aa");
        s1.add("bb");
        System.out.println(s1);
    }


}
