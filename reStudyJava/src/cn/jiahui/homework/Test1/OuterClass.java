package cn.jiahui.homework.Test1;

public class OuterClass {


    public static class Circle implements ICal{
        double radius;
        Circle(double r){
            radius = r;
        }

        @Override
        public double getArea() {
            return P*radius*radius;
        }
    }
}
