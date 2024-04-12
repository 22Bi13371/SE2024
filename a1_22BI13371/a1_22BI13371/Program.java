package a1_22BI13371;

public class Program {
    public static void main(String[] args) {
        Student student = new Student((int)1000, "student", "1234", "somewhere");
        UndergradStudent undergradstudent = new UndergradStudent((int)Math.pow(10,6), "undergrad student", "123456", "somewhere 2");
        PostgradStudent postgradstudent = new PostgradStudent((int)Math.pow(10, 8)+100, "postgrad student", "1234567", "somewhere 3", 3f);

        System.out.println(student);
        System.out.println(undergradstudent);
        System.out.println(postgradstudent);

        System.out.println(student.getAddress());
        student.setAddress("null");
        System.out.println(student.getAddress());
    }
}
