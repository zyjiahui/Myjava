package cn.jiahui.homework;

public class MainClass1 {
    public static void main(String[] args) {
        Generic<Integer> genericInteger = new Generic<>(123456);
        Generic<String> genericString = new Generic<>("jiahui");
        System.out.println(genericInteger.getKey());
        System.out.println(genericString.getKey());
    }
}
//泛型类
class Generic<T>{
    private T key;
    public Generic(T key){
        this.key = key;
    }
    public T getKey(){
        return key;
    }
}
