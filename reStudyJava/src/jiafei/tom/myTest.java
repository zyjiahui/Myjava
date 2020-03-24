package jiafei.tom;

public class myTest {
    public static void main(String[] args){
        Student[] s = new Student[5];
        s[0] = new Student("01","嘉慧01","女",20);
        s[1] = new Student("02","嘉慧02","女",21);
        s[2] = new Student("03","嘉慧03","女",22);
        s[3] = new Student("04","嘉慧04","女",23);
        s[4] = new Student("05","嘉慧05","女",24);
        for(int i=0;i<s.length;i++){
            Student.display(s[i]);
        }

    }
}
