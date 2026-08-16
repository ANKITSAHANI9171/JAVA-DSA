//Check if a number is prime or not
/* 
import java.util.*;

public class Ques3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check prime or not : ");
        int num = sc.nextInt();

        boolean isPrime = true;
        for(int i = 2; i<= num-1; i++){
            if(num % i == 0){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.print(num + " is a prime number");
        }else{
            System.out.print(num + " is not a prime number");
        }
    }
}
*/

//Write a program that reads a set of integers, and 
// then prints the sum of the even and odd integers.
/* 
import java.util.*;

public class Ques3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evensum = 0;
        int oddsum = 0;

        do{
            System.out.print("Enter a number : ");
            number = sc.nextInt();

            if(number % 2 == 0){
                evensum += number;
            }else{
                oddsum += number;
            }
            System.out.print("Do you want to continue ? press 1 for yes or 0 for no :");
            choice = sc.nextInt();

        }while(choice == 1);

        System.out.println("Sum of even number is :" + evensum );
        System.out.println("Sum of odd number is :" + oddsum);
    }
}
*/   

//Write a program to find the factorialof any number entered by the user.
/* 
import java.util.*;
public class Ques3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find factorial : ");
        int number = sc.nextInt();
        int fact = 1;
        for(int i =1; i<=number; i++){
            fact *= i;
        }
        System.out.println("The factorial of " + number + " is " + fact);
    }
}
*/

//Write a program to print the multiplication table of a number N,entered by the user.
import java.util.*;
public class Ques3 {
    public static void multiplication(int number){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num +" * " + i + " ="+ num *i);
        }
    }
    public static void main (String[] args){
        multiplication(5);
    }
}
