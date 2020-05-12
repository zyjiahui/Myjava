package cn.jiahui.homework.calculate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Count extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtResult;
    private JPanel p;
    private final String[] number = {"1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "0", ".", "=", "/"};
    private JButton button[] = new JButton[number.length];
    private double result = 0;     //接收结果的变量
    private String lastCommand = "=";    //最后一个操作符
    private boolean start = true;
    //添加底层
    public Count() {
        super("计算器");
        txtResult = new JTextField(20);   //文本框
        txtResult.setFocusable(false);
        this.add(txtResult, BorderLayout.NORTH);
        p = new JPanel(new GridLayout(4, 4));   //4行4列
        //实例化数组
        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton(number[i]);
            button[i].addActionListener((ActionListener) new ButtonAction());
            button[i].addKeyListener((KeyListener) new KeyAction());
            p.add(button[i]);
        }
        this.add(p, BorderLayout.CENTER);
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    //计算
    public void count(double x) {
        if (lastCommand.equals("+")) {
            result += x;
        } else if (lastCommand.equals("-")) {
            result -= x;
        } else if (lastCommand.equals("*")) {
            result *= x;
        } else if (lastCommand.equals("/")) {
            result /= x;
        } else if (lastCommand.equals("=")) {
            result = x;
        }
        txtResult.setText("" + result);
    }
    //监听加减乘除
    public class ButtonAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input = e.getActionCommand();
            if (input.equals("+") || input.equals("-")
                    || input.equals("*") || input.equals("/") || input.equals("=")) {
                if (start) {
                    if (input.equals("-")) {
                        txtResult.setText(input);
                    } else {
                        lastCommand = input;
                    }
                } else {
                    count(Double.parseDouble(txtResult.getText()));
                    lastCommand = input;
                    start = true;
                }
            } else {
                if (start) {
                    txtResult.setText("");
                    start = false;
                }
                txtResult.setText(txtResult.getText() + input);
            }
        }
    }


    public class KeyAction extends KeyAdapter {
        public void actionPerformed(KeyEvent e) {
            char key = e.getKeyChar();
            //获取数字
            if (key == '0' || key == '1' || key == '2' || key == '3'
                    || key == '4' || key == '5' || key == '6' || key == '7' || key == '8' || key == '9') {
                if (start) {
                    txtResult.setText("");
                    start = false;
                }
                txtResult.setText(txtResult.getText() + key);
            }
            //操作符
            else if (key == '+' || key == '-' || key == '*' || key == '/' || key == '=') {
                if (start) {
                    if (key == '+') {
                        txtResult.setText(String.valueOf(key));
                        start = false;
                    } else {
                        lastCommand = String.valueOf(key);
                    }
                } else {
                    count(Double.parseDouble(txtResult.getText()));
                    lastCommand = String.valueOf(key);
                    start = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        new Count();
    }
}