package cn.jiahui.chouxianglei;

public class Test {
    public static void main(String[] args){
        Phone p1 = new OldPhone();
        Phone p2 = new SmartPhone();
        p1.cell();
        p1.massage();
        p2.cell();
        p2.massage();

        //测试接口的实现
        IPlaygame ip1 = new SmartPhone();  //接口的引用指向已经实现接口的对象
        IPlaygame ip2 = new Psp();
        ip1.playGame();
        ip2.playGame();


        //测试匿名内部类
        //(1)
        IPlaygame i = new IPlaygame() {
            @Override
            public void playGame() {
                System.out.println("实现了匿名内部类");
            }
        };
        i.playGame();


        
        //(2)
        new IPlaygame(){
            public void playGame() {
                System.out.println("实现了匿名内部类2");
            }
        }.playGame();

    }


}
