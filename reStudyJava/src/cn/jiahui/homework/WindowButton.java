package cn.jiahui.homework;

import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowButton extends JFrame implements ActionListener {

    JTextField text1,text2,text3,text4,text5;  //文本框
    JButton buttonEnter;
    JLabel resultJLabel1,resultJLabel2,resultJLabel3,resultJLabel4,resultJLabel5;
    WindowButton(String s){
        super(s);
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        validate();
    }
    void init() {
        setLayout(new FlowLayout());  //设置布局
        resultJLabel1 = new JLabel("请输入数据", JLabel.CENTER);  //标签
        add(resultJLabel1);
        text1 = new JTextField(10);  //文本框
        add(text1);
        resultJLabel2 = new JLabel("请输入数据", JLabel.CENTER);  //标签
        add(resultJLabel2);
        text2 = new JTextField(10);  //文本框
        add(text2);
        resultJLabel3 = new JLabel("请输入数据", JLabel.CENTER);  //标签
        add(resultJLabel3);
        text3 = new JTextField(10);  //文本框
        add(text3);
        buttonEnter = new JButton("确定");
        add(buttonEnter);
        resultJLabel4 = new JLabel("结果", JLabel.CENTER);  //标签
        add(resultJLabel4);
        text4 = new JTextField(10);  //文本框
        add(text4);
        resultJLabel5 = new JLabel("结果", JLabel.CENTER);  //标签
        add(resultJLabel5);
        text5 = new JTextField(10);  //文本框
        add(text5);
        //注册监视器
        buttonEnter.addActionListener(this);
        setBounds(100,100,550,400);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        double x1 = 0,x2 = 0;
        int a = 0, b = 0, c = 0;
            try{
                a = Integer.parseInt(text1.getText());
                b =  Integer.parseInt(text2.getText());
                c =  Integer.parseInt(text3.getText());
                x1 = (-b+ Math.sqrt(b*b-4*a*c))/2*a;
                x2 = (-b-Math.sqrt(b*b-4*a*c))/2*a;
                text4.setText(String.valueOf(x1));
                text5.setText(String.valueOf(x2));

            }catch (NumberFormatException event){
                //event.printStackTrace();
            }

    }
}
