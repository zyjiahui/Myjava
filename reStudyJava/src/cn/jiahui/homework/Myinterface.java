package cn.jiahui.homework;

public class Myinterface {
    public static void main(String[] args) {
        FruitGenerator<String> f1 = new FruitGenerator<>();
        FruitGenerator<Integer> f2 = new FruitGenerator<>();
        FruitGenerator f3 = new FruitGenerator();
        my_print(f1);
        my_print(f2);
        my_print(f3);

    }
    static void my_print(FruitGenerator<?> obj){
        obj.next();
    }
}
//泛型接口
interface Generator<T>{
    public T next();
}
class FruitGenerator<T> implements Generator<T>{
    @Override
    public T next() {
        System.out.println("实现了泛型接口的方法");
        return null;
    }
}
