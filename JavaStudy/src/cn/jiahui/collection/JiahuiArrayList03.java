package cn.jiahui.collection;
import java.util.ArrayList;
public class JiahuiArrayList03<E> {
    private Object[] elementData;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public JiahuiArrayList03(){
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public JiahuiArrayList03(int capacity){

        if(capacity<0){
            throw new RuntimeException("容量不能为负数");
        }else if(capacity==0){
            elementData = new Object[DEFAULT_CAPACITY];
        }else {
            elementData = new Object[capacity];
        }
        //elementData = new Object[capacity];
        //ArrayList l;
    }

    public void add(E element){
        if(size==elementData.length){
            //怎么扩容
            Object[] newArray = new Object[elementData.length+(elementData.length>>1)];
            System.arraycopy(elementData,0,newArray,0,elementData.length);
            elementData =  newArray;
        }
        elementData[size++] = element;
    }
    public E get(int index){
        return (E)elementData[index];
    }

    public void set(E element,int index){
        //判断索引是否合法[0,size),若不合法抛出异常
        checkRange(index);
        elementData[index] = element;
    }
    public void checkRange(int index){
        if(index<0||index>size-1){
            throw new RuntimeException("索引不合法："+index);
        }
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0;i<size;i++){
            sb.append(elementData[i]+",");
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }

    public static void main(String[] args){
        JiahuiArrayList03 s1 = new JiahuiArrayList03();
        for(int i=0;i<40;i++){
            s1.add("de"+i);
        }

        System.out.println(s1);

        s1.set("efe",10);
        //s1.set("sd",-13);测试索引是否合法
        System.out.println(s1);

        System.out.println(s1.get(39));
    }
}
