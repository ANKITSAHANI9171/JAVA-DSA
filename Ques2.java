//Q1.Write a Java program to get a number from the user and print whether it is positive or negative
/* 
import java.util.*;

public class Ques2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num>0){
            System.out.println("num is positive");
        }
        else if(num<0){
            System.out.println("num is negative");
        }
        else {
            System.out.println("num is zero");
        }

    }
}
*/

//Q2.Write a Java program to input week number (1-7) and 
//print day of week name using switch case.

/* 
import java.util.*;

public class Ques2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday"); 
                break;
            case 4:
                System.out.println("Thrusday"); 
                break;
            case 5:
                System.out.println("Friday"); 
                break;
            case 6:
                System.out.println("Saturday"); 
                break;
            default:
                System.out.println("Sunday");
        }
    }

}
*/

//Q3.Write a Java program that takes a year from the user 
// and print whether that year is a leap year or not.
import java.util.*;

public class Ques2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the year :");
        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0 ) && (year % 400 == 0));

        if (x && (y || z)){
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }                
    }
}