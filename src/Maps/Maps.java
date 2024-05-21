package Maps;

import Collection.Employee;

import java.util.*;

public class Maps {
    public static void main(String[] args) {

        Map<String,Integer> num = new HashMap<>();
        num.put("one",1);
        num.put("Two",2);
        num.put("",3);
        System.out.println(num);
        System.out.println(num.keySet());
        System.out.println(num.values());
        System.out.println(num.containsKey("one"));
        System.out.println(num.containsValue(2));
        Map<String,Integer> map = new HashMap<>();
        map.put("Three",3);
        map.putAll(num);
        System.out.println(map);
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"");
        map1.put(2,"");
        map1.put(5,"");
        List <Employee>list = new ArrayList<>();
        Map<String,List<Employee>> map2 =new HashMap<>();
        Employee employee = new Employee(1,"shan","HOD");
        Employee employee1 = new Employee(2,"Ram","Dean");
        list.add(employee);
        list.add(employee1);
        map2.put("Tech",list);
        System.out.println();
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
