import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
        public static void main(String[] args) {
            //System.out.println("Hello world!");
//        String s=new String("Ride");
//        String s1=new String("Ride");

            //String s1="Ride";
            String s="New Day";
            String s1="new day";
            System.out.println(s.equalsIgnoreCase(s1));
            // System.out.println(s1==s);
//        s+=s1;//s=s+s1;
//       String ch[]=s1.split(",");
//
//       System.out.println(Arrays.toString(ch));

            //System.out.println(ch);
//        int a[]={1,3,5};
            //System.out.println(Arrays.toString(a));
            StringBuilder sb=new StringBuilder("tttttt");
//        System.out.println(sb.reverse());
//        sb.append(" work");
            System.out.println(sb.capacity());
            Scanner sc=new Scanner(System.in);
            sb.append(sc.nextLine());
            System.out.println(sb);
            System.out.println(sb.capacity());

//        for(int i=s1.length()-1;i>=0;i--){
//            System.out.print(s1.charAt(i));
//        }
//        s1.replace('n','f');
//        System.out.println(s1);

        }
    }
