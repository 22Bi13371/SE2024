import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import a1_22BI13371.PostgradStudent;
import a1_22BI13371.Student;
import a1_22BI13371.UndergradStudent;

public class Program {
    public static void main(String[] args) {
        Student student = new Student((int)1000, "student a", "1234 a", "somewhere a");
        Student student2 = new Student((int)1000, "student b", "1234 b ", "somewhere b");
        Student student3= new Student((int)1000, "student c", "1234 c", "somewhere c");
        UndergradStudent undergradstudent = new UndergradStudent((int)Math.pow(10,6), "undergrad student", "123456", "somewhere 2");
        PostgradStudent postgradstudent = new PostgradStudent((int)Math.pow(10, 8)+100, "postgrad student", "1234567", "somewhere 3");

        // System.out.println(student);
        // System.out.println(undergradstudent);
        // System.out.println(postgradstudent);

        // System.out.println(student.getAddress());
        // student.setAddress(null);
        // System.out.println(student.getAddress());

        List<Student> students = new ArrayList<Student>();
        students.add(student3);
        students.add(student);
        students.add(student2);
        
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);
    }
}
