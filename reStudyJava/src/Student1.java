import java.util.Scanner;

public class Student1 {
    public static void main(String[] args){
        People[] p1 = new People[2];
        for(int i=0;i<p1.length;i++){
            p1[i] = new People();
        }
        Scanner data = new Scanner(System.in);
        for(int i=0;i<p1.length;i++){
            System.out.print("请输入第"+(i+1)+"学生的姓名：");
            p1[i].name = data.next();
            System.out.print("请输入第"+(i+1)+"个学生的分数：");
            p1[i].score = data.nextDouble();
        }

        for(int i=0;i<p1.length-1;i++){
            for(int j=0;j<p1.length-i-1;j++){
                if(p1[i].score>p1[i+1].score){
                    People temp = p1[i];
                    p1[i] = p1[i+1];
                    p1[i+1] = temp;
                }
            }
        }
        System.out.println("################################################");
        for(int j=0;j<p1.length;j++){
            System.out.println("姓名为"+p1[j].name+"的学生分数为："+p1[j].score);
        }
    }

}

class People{
    //People[] p1 = new People[2];
    String name;
    double score;
}
