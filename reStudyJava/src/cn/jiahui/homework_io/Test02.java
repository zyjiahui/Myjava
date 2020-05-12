package cn.jiahui.homework_io;
import java.io.*;
import java.util.Scanner;
public class Test02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("输入写入文件的文件名：");
        File file = new File(scan.next());
        //String s1 = scan.nextLine();
        System.out.println("输入想要写入的内容：");
        String[] string = new String[5];
        for(int i=0;i<string.length;i++){
            string[i] = scan.next();
        }
        try{
            FileWriter write1 = new FileWriter(file);
            BufferedWriter b_write = new BufferedWriter(write1);
            for(String str:string){
                b_write.write(str);
                b_write.newLine();
            }
            b_write.close();
            write1.close();
            FileReader read1 = new FileReader(file);
            BufferedReader b_read = new BufferedReader(read1);
            String s2 = null;
            while((s2 = b_read.readLine())!=null){
                System.out.println(s2);
            }
            read1.close();
            b_read.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
