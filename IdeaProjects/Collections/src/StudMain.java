import java.util.ArrayList;
import java.util.Collections;

public class StudMain {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Vijay"));
        al.add(new Student(106,"Ajay"));
        al.add(new Student(105,"Jai"));

        Collections.sort(al);

        for(Student st:al){
            System.out.println(st.id+" "+st.name);
        }
    }
}
