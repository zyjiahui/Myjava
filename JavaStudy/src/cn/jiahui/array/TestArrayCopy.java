package cn.jiahui.array;

public class TestArrayCopy {
    public static void main(String[] args){
        test1();
        test2();
        String str4[] ={"1","2","3","5","6"};
        removeElment(str4,3);
        extendRange();

    }
    public static void test1(){
        String[] str1 ={"a","b","c","d"};
        String[] str2 = new String[10];
        System.arraycopy(str1,1,str2,2,3);

        for(int i=0;i<str2.length;i++){
            System.out.println(str2[i]);

        }
        System.out.println("******************************************");
    }

    public static void test2(){
        String[] str3 ={"a","b","c","d","e"};
        System.arraycopy(str3,3,str3,3-1,str3.length-3);

        for(int i=0;i<str3.length;i++){
            System.out.println(str3[i]);


        }System.out.println("**********************************************");
    }
    public static void removeElment(String[] s, int index){
        System.arraycopy(s,index,s,index-1,s.length-index);//1 2 3 5 6
        s[s.length-1]=null;
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
        System.out.println("***************************");
    }


    //数组的扩容(本质上是：先定义一个更大的数组，然后原数组内容原封不动的拷贝到其中)
    public static void extendRange(){
        String[] s1 ={"aa", "bb", "cc"};
        String[] s2 = new String[s1.length+10];
        System.arraycopy(s1,0,s2,0,s1.length);
        for(String temp:s2){
            System.out.println(temp);
        }
    }
}

