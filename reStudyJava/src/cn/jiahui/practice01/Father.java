package cn.jiahui.practice01;

public class Father {      //father父类
    private int money;
    int weight;
    int getWeight(){
        return weight;
    }
    protected void setWeight(int myweight){
        weight = myweight;
    }
    public void setMoney(int money){
        this.money = money;
    }
    int getMoney(){
        return money;
    }
}
