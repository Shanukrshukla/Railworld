package Collection;

import java.util.*;

public class ArraList1 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
//        arrayList.add("gjhgjhg");

        arrayList.remove(1);
//        for(Integer i:arrayList){
//            System.out.println(i);
//        }

        ArrayList<Employee> arrayList1=new ArrayList<>();
        //Employee employee = null;
        Employee employee1=new Employee(2,"gfhgf","fghfhg");
        Employee employee2=new Employee(1,"gfhgf","fghfhg");
        arrayList1.add(employee1 );

        arrayList1.add(employee2);
//       arrayList1.remove(employee1);
//       System.out.println(arrayList1);
        Collections.sort(arrayList1,new EmployeeComparator());
        for(Employee employee:arrayList1){
            System.out.println(employee);
        }

//        Set<Employee> set = new HashSet<>();
//        set.add(employee1);
//        set.add(employee2);
//        System.out.println("set "+ set);
        //Set<Integer>set1 =new HashSet<>();
    }
}