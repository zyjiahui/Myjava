package cn.jiahui.jiekou;

public class TestInnerClass {
    public static void main(String[] args){
        Outer.Inner inner = new Outer().new Inner();//非静态内部类的调用
        inner.test();
    }

}

class Outer {
    private int age=10;

    public void testOuter(){
        System.out.println("测试");
    }
    class Inner {
        public void test(){
            System.out.println(Outer.this.age);
        }

    }
}
