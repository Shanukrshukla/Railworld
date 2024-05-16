import java.util.Scanner;

public class LeapYear {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int year = sc.nextInt(); // Change this to the year you want to check

            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }

        public static boolean isLeapYear(int year) {
            // A leap year is divisible by 4 and not divisible by 100,
            // unless it is also divisible by 400
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
    }

