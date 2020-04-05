package cn.jiahui.IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 字节数组输出流（4步）ByteArrayOutputStream
 * 1、创建源：内部维护
 * 2、选择流：不关联源
 * 3、操作（写出操作）
 * 4、释放资源：可以不用
 *
 * 增加：获取数据 toByteArray();方法获取
 *
 * */
public class ZiJieShuZuOutput {
    public static void main(String[] args) {
        //创建源
        byte[] dest = null;
        //选择流
        ByteArrayOutputStream baos = null;
        try {
            baos = new ByteArrayOutputStream();
            String msg = "show your code";
            byte[] datas = msg.getBytes();
            baos.write(datas,0,datas.length);
            baos.flush();
            //获取数据
            dest = baos.toByteArray();
            System.out.println(dest.length + "-->"+new String(dest,0,baos.size()));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {

        }
    }
}
