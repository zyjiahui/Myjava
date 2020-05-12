package cn.jiahui.homework.Test2;

public class min extends Exception {
    String message;
    public min(String num){
        message = "该学号"+num+"小于6位";
    }
    public String toString(){
        return message;
    }
}
class max extends Exception{
    String message;
    public max(String num){
        message = "该学号"+num+"大于6位";
    }
    public String toString(){
        return message;
    }
}
class Student{
    private String num;
    public void setNum(String num)throws min,max{
        if(num.length()<6){
            throw new min(num);
        }else if(num.length()>6){
            throw new max(num);
        }else {
            this.num = num;
        }
    }
    public String getNum(){
        System.out.println("成绩"+num+"合理");
        return num;
    }
}
