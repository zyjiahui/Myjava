package cn.jiahui.practice01;

public class Test01 {
    public static void main(String[] args) {
        Father f = new Father();
        f.setMoney(10000);
        f.setWeight(70);
        Son son = new Son();
        son.setWeight(70);
        son.setHand("大手");
        Grandson gs = new Grandson();
        gs.setFoot("小脚");
        gs.setWeight(50);
        System.out.println("父亲的工资："+f.getMoney()+"父亲的体重："+f.getWeight());
        System.out.println("儿子的体重："+son.getWeight()+"儿子的手："+son.getHand());
        System.out.println("孙子的脚："+gs.getFoot()+"孙子的体重："+gs.getWeight());


    }
}
