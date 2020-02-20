package cn.jiahui.jiekou;
/**
 * 测试接口和实现类
 * */
public class TestInterFace {
    public static void main(String[] args){
        Volant v = new Angle();
        v.fly();
        Angle a = new Angle();
        a.fly();
        a.helpOther();

    }
}

//飞行接口，实现此接口都是飞行器
interface Volant{
    int FLY_HEIGHT=1000;
    void fly();
}
interface Honest{
    void helpOther();
}

//实现接口   实现类可以实现多个父接口
class Angle implements Volant,Honest{
    @Override
    public void fly() {
        System.out.println("Angle.helpOther()");
    }

    @Override
    public void helpOther() {
        System.out.println("Angle.fly()");
    }
}
class GoodMan implements Honest{
    @Override
    public void helpOther() {
        System.out.println("GoodMan.helpOther()");
    }
}
class BirdMan implements Volant{
    @Override
    public void fly() {
        System.out.println("BirdMan.fly()");
    }
}