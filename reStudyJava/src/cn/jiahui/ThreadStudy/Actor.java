package cn.jiahui.ThreadStudy;

public class Actor  extends Thread{
    //重写run
    @Override
    public void run() {
        int count = 0;
        boolean mystop = true;
        System.out.println(getName()+"是一个演员");
        while (mystop){
            count++;
            System.out.println(getName()+ "已经出演了"+count+"场演出");
            if(count == 100){
                mystop = false;
            }

            if(count%20 == 0){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(getName()+"的演出结束！");

    }

    public static void main(String[] args) {
        Thread actor = new Actor();
        actor.setName("Mr.Thread");
        actor.start();

        Thread actress = new Thread(new Actress(),"Ms.Runable");
        actress.start();
    }

}
class Actress implements Runnable{
    @Override
    public void run() {
        int count = 0;
        boolean mystop = true;
        System.out.println(Thread.currentThread().getName()+"是一个演员");
        while (mystop){
            count++;
            System.out.println(Thread.currentThread().getName()+ "已经出演了"+count+"场演出");
            if(count == 100){
                mystop = false;
            }

            if(count%20 == 0){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(Thread.currentThread().getName()+"的演出结束！");

    }
}
