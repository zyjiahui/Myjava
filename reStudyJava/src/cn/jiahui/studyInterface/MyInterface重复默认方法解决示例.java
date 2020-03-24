package cn.jiahui.studyInterface;

public class MyInterface重复默认方法解决示例 implements MyInterface默认方法重复方法过多的解决 {
    public void methodAnother(){
        //直接访问了接口的默认，这是错误的
        //reMethod(); //接口中的默认方法私有化之后，此处报错

    }
}
