package cn.jiahui.duotai;
/**
 * 必须有继承才有多态（继承是多态的实现基础）
 * */
public class Test1 {
    public static void main(String[] args){
        TestAnimal obg1 = new TestAnimal();//父类引用可以指向本类的对象
        TestAnimal obg2 = new TestDog();//父类引用可以指向子类的对象
        //TestDog obg3 = new TestAnimal();  不能子类引用指向父类的对象
        TestAnimal obg4 = new TestCat();
        obg1.eat();
        obg2.eat();  //本类调用本类的方法
        obg4.eat();  //没有重写的方法，会调用父类的方法


        //向上类型转换(小的向大的转换)，自动类型转换
        TestDog dog = new TestDog();
        TestAnimal animal = dog;
        //强制类型转换
        if(animal instanceof TestDog){
            TestDog dog1 = (TestDog) animal;//强制把dog类型转化为animal
            System.out.println("转化成功");
        }else {
            System.out.println("不能进行强制类型转换");
        }


        //instanceof 来避免强制类型转换产生的问题
        if(animal instanceof TestCat){
            TestCat cat = (TestCat)animal;
        }else {
            System.out.println("无法进行类型转换");
        }
    }
}
