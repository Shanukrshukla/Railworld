import Model.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Employee employee = new Employee();
       employee.setName (sc.nextLine());
       employee.setAddress(new Address("2","indore","mp",121212) );
        System.out.println(employee.toString());
    }
}