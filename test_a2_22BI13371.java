import kengine.*;
import studentman.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import studentman.PostgradStudent;
import studentman.ProgStudentMan;
import studentman.Student;
import studentman.UndergradStudent;



public class test_a2_22BI13371 {
    public static void main(String[] args) {
        // Student student = new Student((int)1000, "student a", "1234 a", "somewhere a");
        // Student student2 = new Student((int)1000, "student b", "1234 b ", "somewhere b");
        // Student student3= new Student((int)1000, "student c", "1234 c", "somewhere c");
        // UndergradStudent undergradstudent = new UndergradStudent((int)Math.pow(10,6), "undergrad student", "123456", "somewhere 2");
        // PostgradStudent postgradstudent = new PostgradStudent((int)Math.pow(10, 8)+100, "postgrad student", "1234567", "somewhere 3", 2);

        // System.out.println(student.getName());
        // student.setName( null);
        // System.out.println(student.getName());

        // System.out.println(student.getName());
        // student.setName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // System.out.println(student.getName());

        // System.out.println(student.getName());
        // student.setName("asdqwe ");
        // System.out.println(student.getName());

        // System.out.println(student.getPhoneNumber());
        // student.setPhoneNumber( null);
        // System.out.println(student.getPhoneNumber());

        // System.out.println(student.getPhoneNumber());
        // student.setPhoneNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // System.out.println(student.getPhoneNumber());

        // System.out.println(student.getPhoneNumber());
        // student.setPhoneNumber("asdqwe ");
        // System.out.println(student.getPhoneNumber());

        // System.out.println(student.getAddress());
        // student.setAddress( null);
        // System.out.println(student.getAddress());

        // System.out.println(student.getAddress());
        // student.setAddress("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // System.out.println(student.getAddress());

        // System.out.println(student.getAddress());
        // student.setAddress("asdqwe ");
        // System.out.println(student.getAddress());

        // System.out.println(undergradstudent.getName());
        // undergradstudent.setName("asdqwe ");
        // System.out.println(undergradstudent.getName());
        
        // System.out.println(postgradstudent.getGPA());
        // postgradstudent.setGpa(0.5);
        // System.out.println(postgradstudent.getGPA());

        // System.out.println(student.toHtmlDoc());
        // System.out.println(undergradstudent.toHtmlDoc());
        // System.out.println(postgradstudent.toHtmlDoc());

        // System.out.println(student.getAddress());
        // student.setAddress(null);
        // System.out.println(student.getAddress());

        // List<Student> students = new ArrayList<Student>();
        // students.add(student3);
        // students.add(student);
        // students.add(student2);
        
        // System.out.println(students);
        // Collections.sort(students);
        // System.out.println(students);

        // 1. Initialize an Engine
        Engine eng = new Engine();
        ProgStudentMan progStudentMan = new ProgStudentMan();

        // // 2. Initialize the document collection of the engine
        progStudentMan.main(args);

        // System.out.println(progStudentMan.toString());


        // eng.addDoc(new Doc(student.toHtmlDoc()));
        // eng.addDoc(new Doc(student2.toHtmlDoc()));
        // eng.addDoc(new Doc(student3.toHtmlDoc()));
        // eng.addDoc(new Doc(undergradstudent.toHtmlDoc()));
        // eng.addDoc(new Doc(postgradstudent.toHtmlDoc()));

        // System.out.println(eng.toString());
       


        // 3. Search for documents using a queryu that contains one keyword


        // 4. refine search query by incrementally add more keywords
        
    }
}
