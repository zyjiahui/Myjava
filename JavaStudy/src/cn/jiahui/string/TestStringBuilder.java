package cn.jiahui.string;

public class TestStringBuilder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++){
            char temp = (char)('a'+i);
            sb.append(temp);
        }
        System.out.println(sb);

        //倒序输出
        sb.reverse();
        System.out.println(sb);

        //替换其中的一个
        sb.setCharAt(4,'嘉');
        System.out.println(sb);

        //插入一个
        sb.insert(0,'慧').insert(7,'啸').insert(10,'岳');
        System.out.println(sb);

        //删除
        sb.delete(20,23);
        System.out.println(sb);
    }
}
