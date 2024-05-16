package DateTime;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);//yyyy-mm-dd
        LocalDate localDate1=LocalDate.from(ZonedDateTime.now());
        System.out.println(localDate1);
        LocalDate localDate2=LocalDate.of(1999,04,13);
        System.out.println(localDate2);
        String s="2000-12-12";
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate3=LocalDate.parse(s);
        String s1=localDate3.format(dateTimeFormatter);
        System.out.println(s1);
        LocalDate yesterday = localDate.minusDays(1);
        LocalDate tommorow=localDate.plusDays(1);
        System.out.println(yesterday+" "+tommorow);

//2004/4    2100/40
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        if(n%100==0){
//            if(n%400==0) {
//                System.out.println(n + " Year is a Leap year");
//            }
//            System.out.println("Not a leap year");
//        }
//        else if(n%4==0){
//            System.out.println(n+" Year is a Leap year");
//        }
//        else
//        {
//            System.out.println(n+" year is not a Leap year");
//        }

        String string="1995-05-17";
        LocalDate localDate4=LocalDate.parse(string);
        String string1=localDate4.format(dateTimeFormatter);
        System.out.println(string1);


    }


}