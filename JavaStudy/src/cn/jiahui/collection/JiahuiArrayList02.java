package cn.jiahui.collection;

//增加数组扩容
public class JiahuiArrayList02<E> {
    private Object[] elementData;
    private int size;

    private static final int DEFAULT_CAPACITY = 10;

    public JiahuiArrayList02(int capacity){
        elementData = new Object[capacity];  //创建了一个数组，长度为10
    }

    public void add(E element){
        //什么时候扩容？size值=常量DEFAULT_CAPACITY = 10
        if(size==elementData.length){
            //怎么扩容
            Object[] newArray = new Object[elementData.length+(elementData.length>>1)];//扩大了2倍，   <<1,相当于*2  10→10+10/2
            System.arraycopy(elementData,0,newArray,0,elementData.length);//拷贝数组elementDate到新数组newArray中
            elementData =  newArray;
        }
        elementData[size++] = element;
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
        JiahuiArrayList02 s1 = new JiahuiArrayList02(20);

        //数组越界，需要扩容
        for(int i=0;i<40;i++){
            s1.add("jia"+i);
        }

        System.out.println(s1);

    }
}
