package cn.jiahui.homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComponentInWindow extends JFrame implements ActionListener {   //实现监听
    int num; //随机数
    JMenuBar menubar;  //菜单条
    JMenu menu1,menu2;   //菜单
    JMenuItem item1,item2,item3,item4;   //菜单项
    JLabel welcomeJLabel,resultJLabel;  //欢迎文字和显示结果
    JTextField text;  //文本框
    JButton buttonEnter,buttonGet;  //获取随机数按钮和确定按钮
    ComponentInWindow(String s){
        super(s);
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        validate();
    }
    void init() {
        setLayout(new FlowLayout());  //设置布局


        menubar = new JMenuBar();
        menu1 = new JMenu("选择");
        menu2 = new JMenu("设置");
        item1 = new JMenuItem("开始游戏",new ImageIcon("d:/MyJava/images/start.png"));
        item2 = new JMenuItem("结束游戏",new ImageIcon("d:/MyJava/images/end.png"));
        item3 = new JMenuItem("设置1");item4 = new JMenuItem("设置2");
        menu1.add(item1);menu1.add(item2);menu2.add(item3);menu2.add(item4);menubar.add(menu1);menubar.add(menu2);
        setJMenuBar(menubar);

        buttonGet = new JButton("开始游戏");
        add(buttonGet);

        resultJLabel = new JLabel("请输入数据",JLabel.CENTER);  //标签
        add(resultJLabel);   //相当于this.add();   加入到当前对象ComponentInWindow窗口中
        text = new JTextField(10);  //文本框
        add(text);
        buttonEnter = new JButton("确定");
        add(buttonEnter);

        welcomeJLabel= new JLabel("游戏规则：已随机生成一个1到100的整数，您能猜出来吗？");
        welcomeJLabel.setFont(new Font("haha",1,10));
        add(welcomeJLabel);

        //注册监视器
        buttonEnter.addActionListener(this);
        buttonGet.addActionListener(this);
        setBounds(100,100,400,400);

    }

    @Override
    public void actionPerformed(ActionEvent e) {  //重写抽象方法
        if(e.getSource() == buttonGet){
            num = (int)(Math.random()*100)+1;  //获取100以内的随机数
            resultJLabel.setText("请输入数据");
        }else if(e.getSource() == buttonEnter){
            int guess = 0;
            try {
                guess = Integer.parseInt(text.getText());
                if(guess == num){
                    resultJLabel.setText("猜对了");
                }else if(guess > num){
                    resultJLabel.setText("猜大了");
                    text.setText(null);  //文本框置空
                }else if(guess < num){
                    resultJLabel.setText("猜小了");
                    text.setText(null);
                }
            }catch (NumberFormatException event){
                resultJLabel.setText("请输入整数字符");
            }
        }

    }
}


