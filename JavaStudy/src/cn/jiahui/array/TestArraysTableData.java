package cn.jiahui.array;

import java.util.Arrays;

public class TestArraysTableData {
    public static void main(String[] args){
        Object[] emp1 = {1001,"嘉慧",20,"学生",2018};
        Object[] emp2 = {1002,"嘉慧1",22,"学生",2013};
        Object[] emp3 = {1003,"嘉慧2",23,"学生",2014};

        Object[][] tableData = new Object[3][];
        tableData[0] = emp1;
        tableData[1] = emp2;
        tableData[2] = emp3;

        for(Object[] temp:tableData){
            System.out.println(Arrays.toString(temp));
        }

    }
}
