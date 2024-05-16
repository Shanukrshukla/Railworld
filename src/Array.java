import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int a[][] = new int[m][n]; // declaration
        for (int i = 0; i < m; i++) //value assign
        {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < m; i++) { //to show array
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("transpose");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("spiral");
        for (int i = 0; i < m; i++) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();

        }
       // System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.deepToString(a));
        //Addition Substraction , multiplication,print both the diagonal,right triangle ,left triangle

    }
}