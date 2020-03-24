package jiafei.tom;

public class Student {
    private String num;
    private String name;
    private String sex;
    private int age;
    Student(String num,String name,String sex,int age){
        this.num = num;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    static void display(Student s1){
        //s1.num="1234";
        //s1.name="嘉慧";
        //s1.sex="女";
        //s1.age=20;
        System.out.println("学号："+s1.num+" "+"姓名："+s1.name+" "+"性别："+s1.sex+" "+"年龄："+s1.age);
    }
}
