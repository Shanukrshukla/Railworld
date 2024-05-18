package Maps;
import Model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        List <Collection.Employee>list = new ArrayList<>();


        Stack<List<Collection.Employee>> stack = new Stack<>();
        stack.push(list);
        System.out.println(stack);

        stack.add(list);
        System.out.println(stack);
//        stack.pop();
//     System.out.println(stack);
        stack.remove(list);
        System.out.println(stack);
//        ArrayList<> arrayList=new ArrayList<>();
//        List<> list1=new ArrayList<>();

        Stack<Map<String,List<Employee>>> stack1=new Stack<>();

//        stack1.add();
        System.out.println(stack1);

    }
}
