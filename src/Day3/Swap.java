package Day3;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x and y ");
        int x = sc.nextInt();//10
        int y = sc.nextInt();//5
        System.out.println("Before Swap :" +"x = "+x +" y = " +y);
        x = x + y; // x = 10+5 = 15
        y = x - y; // y = 10-5 = 5
        x = x - y; // x = 15-5 = 10
        System.out.println("after Swap :" +"x = "+x +" y = " +y );
    }
}
