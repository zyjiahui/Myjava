package cn.jiahui.yicahng;

import java.io.FileReader;
import java.io.IOException;

public class TestThrows {
    public static void main(String[] args) throws IOException{
        readMyFile();

    }

    public static void readMyFile() throws IOException {
        FileReader reader = null;
        reader = new FileReader("d:a.txt");
        char c1 = (char)reader.read();
        if(reader!=null){
            reader.close();
        }
    }
}
