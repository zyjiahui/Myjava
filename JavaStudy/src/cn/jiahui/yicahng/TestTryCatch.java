package cn.jiahui.yicahng;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestTryCatch {
    public static void main(String[] args){
        FileReader reader = null;
        try{
            reader = new FileReader("d:a.txt");

            char c1 = (char)reader.read();
            System.out.println(c1);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(reader!=null){
                    reader.close();
                }
            }catch (IOException e){
               e.printStackTrace();
            }
        }
    }
}
