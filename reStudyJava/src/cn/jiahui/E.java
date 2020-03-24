package cn.jiahui;

public class E {
    public static void main(String[] args){  //main方法，程序的入口
        A a = new A();  //实例化一个类的对象，给a分配内存空间
        System.out.println("**"+a.f(10,(byte)10));  //调用函数f(int ,byte ),把第二个参数强转为byte类型（由大向小转，用强制类型转换）
        System.out.println("##"+a.f(10,10));  //调用f函数的重载函数f(int ,int )
        f(1,2);  //调用静态方法，可直接用类名调用该方法
        f(-1,-2,-3,-4);//调用静态方法
        f(9,7,6);//调用静态方法
    }
    public static void f(int ...x){  //定义一个静态类型方法，可变参数，x相当于数组名
        for(int i=0;i<x.length;i++){    //循环输出每个元素
            System.out.println(x[i]);
        }
        System.out.println("__________________");
    }
}
class A{  //定义A类
    int f(int x,byte y){  //类的普通方法
        return x+y;    //有返回值，函数类型不能是void
    }
    int f(int x,int y){     //f函数的重载，函数名相同，参数类型不同
        return x+y;
    }
}
