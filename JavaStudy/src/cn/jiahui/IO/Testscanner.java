package cn.jiahui.IO;

import java.util.Scanner;
/**
 * 3个班级分别4个学生，求分数和及平均分
 * */
public class Testscanner {
    public static void main(String[] args){
        int classNum = 3;
        int stuNum = 4;
        double avg=0;
        int sum=0;
        Scanner input = new Scanner(System.in);
        for(int i=1;i<=classNum;i++){
            sum = 0;
            System.out.println("请输入第"+i+"班的学生成绩");
            for(int j=1;j<=stuNum;j++){
                System.out.println("请输入第"+j+"个学生的成绩：");
                int score = input.nextInt();
                sum+=score;  //总成绩
            }
            avg = sum/stuNum;  //某班的平均分
            System.out.println("第"+i+"个班级的平均分"+avg);  //
        }

    }
}
