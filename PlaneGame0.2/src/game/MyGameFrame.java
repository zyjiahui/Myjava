package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

public class MyGameFrame extends Frame {
    Image planeImg = GameUtil.getImage("images/plane.png");
    Image bg = GameUtil.getImage("images/bg.jpg");
    //int planeX=250,planeY=250;
    Plane plane = new Plane(planeImg,250,250);
    Shell shell = new Shell();
    Shell[] shells = new Shell[50];
    Explode bao;
    Date startTime = new Date();
    Date endTime;
    int period;  //游戏持续的时间

    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(bg,0,0,null);
        plane.drawSelf(g);//画飞机
        //画出所有的炮弹
        for(int i=0;i<shells.length;i++){
            shells[i].draw(g);
            boolean peng=shells[i].getRect().intersects(plane.getRect());

            if(peng){
                plane.live = false;
                if(bao==null){
                    bao = new Explode(plane.x,plane.y);

                    endTime = new Date();
                    period = (int)((endTime.getTime()-startTime.getTime())/1000);
                }
                g.setColor(Color.WHITE);
                g.drawString("时间："+period+"秒",(int)plane.x,(int)plane.y);


                bao.draw(g);
            }
        }


        /*g.drawImage(plane,planeX,planeY,null);
        planeX++;
        planeY++;*/
        /*Color c=g.getColor();
        Font f=getFont();
        g.setColor(Color.BLUE);
        g.drawLine(100,100,300,300);
        g.drawRect(100,100,300,300);
        g.drawOval(100,100,300,300);
        g.fillRect(100,100,40,40);
        g.setColor(Color.RED);
        g.setFont(new Font("宋体",Font.BOLD,50));
        g.drawString("欢迎",200,200);
        g.drawImage(plane,250,250,null);
        g.setColor(c);
        g.setFont(f);*/

    }
    class PaintThread extends Thread{
        @Override
        public void run() {
            while(true){
                //System.out.println("窗口被画一次");
                repaint();
                try{
                    Thread.sleep(40);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    //定义键盘监听内部类
    class KeyMonitor extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            plane.addDirection(e);
        }
        public void keyReleased(KeyEvent e) {
            super.keyReleased(e);
            plane.minusDirection(e);
        }
    }
    //初始化窗口
    public void launchFrame(){
        this.setTitle("嘉慧");
        this.setVisible(true);
        this.setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
        this.setLocation(300,300);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        new PaintThread().start();//启动窗口的重画线程
        addKeyListener(new KeyMonitor());
        //初始化50个炮弹
        for(int i=0;i<shells.length;i++){
            shells[i]=new Shell();
        }
    }
    public static void main(String[] args){
        MyGameFrame f = new MyGameFrame();
        f.launchFrame();
    }

    private Image offScreenImage = null;

    public void update(Graphics g) {
        if(offScreenImage == null)
            offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//这是游戏窗口的宽度和高度

        Graphics gOff = offScreenImage.getGraphics();
        paint(gOff);
        g.drawImage(offScreenImage, 0, 0, null);
    }

}
