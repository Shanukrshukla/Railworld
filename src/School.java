
import Model.Student;
import Model.Subject;
import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student  = new Student();
        student.setName(sc.nextLine());
        student.setAddress("Indore");
        student.setSubject(new Subject( "25" ,"28","29"));
        System.out.println(student.toString());

    }

}
