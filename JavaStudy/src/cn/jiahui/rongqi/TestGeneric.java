package cn.jiahui.rongqi;

public class TestGeneric {
    public static void main(String[] args){
        MyCollection<String> mc = new MyCollection<>();
        mc.set("嘉慧",0);
        //mc.set(432323,1);
        //Integer a = (Integer)mc.get(0);
        String b = mc.get(1);

    }
}

class MyCollection<E>{
    Object[] objs = new Object[5];
    public void set(E e,int index){
        objs[index] = e;
    }
    public E get(int index){
        return (E)objs[index];
    }
}
