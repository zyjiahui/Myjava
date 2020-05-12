package cn.jiahui.ThreadStudy;
/**
 * 创建线程方式一：
 *   1、创建：继承Thread + 重写run
 *   2、启动线程：创建子类对象 + start
 * */
public class startThread extends Thread{
    //重写run线程入口点
    @Override
    public void run() {  //线程体
        //super.run();
        for(int i=0;i<20;i++){
            System.out.println("一边听歌");
        }
    }

    public static void main(String[] args) {
        //创建子类的对象
        startThread st = new startThread();
        //启动（子类调用start）
        st.start();  //开启线程后交给cpu去调，不一定立即调用
        for (int i=0;i<20;i++){
            System.out.println("一边coding");
        }

    }
}
