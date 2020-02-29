package cn.jiahui.chouxianglei;
/**
 * 可以实现接口
 * 同时必须实现接口里的方法 playGame()
 * */
public class SmartPhone extends Phone implements IPlaygame{   //继承不能忘记
    public void cell(){
        System.out.println("用语音打电话");
    }
    public void massage(){
        System.out.println("用语音发短信");
    }
    public void playGame(){
        System.out.println("智能手机可以打游戏");
    }
}
