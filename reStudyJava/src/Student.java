import java.util.Scanner;
public class Student {
    public static void main(String[] args){
        String[] name = new String[10];
        double[] score = new double[10];
        Scanner name1 = new Scanner(System.in);
        Scanner score1 = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.print("请输入第"+(i+1)+"学生的姓名：");
            name[i]=name1.nextLine();
            System.out.print("请输入第"+(i+1)+"个学生的分数：");
            score[i]=score1.nextDouble();
        }
        for(int j=0;j<10;j++){
            System.out.println("姓名为"+name[j]+"的学生分数为："+score[j]);
        }
    }
}
