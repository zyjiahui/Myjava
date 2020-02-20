package cn.jiahui.string;

public class TestEnum {
    public static void main(String[] args){
        System.out.println(Season.SUMMER);
        Season s = Season.SPRING;

        switch (s){
            case AUTUMN:System.out.println("erfer");
            break;
        }
    }
}

enum Season {
    SPRING,SUMMER,AUTUMN,WINTER
}
enum Week {
    周一,周二,周三,周四,周五,周六,周日
}
