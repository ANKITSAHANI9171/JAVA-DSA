/* 
public class Loop {
    public static void main(String[] args){
        int counter = 0;
        while (counter < 10){
            System.out.println("Hello world");
            counter++;
        }
        System.out.println("print Hello world 10x");
    }
}
*/

/* 
public class Loop {
    public static void main(String[] args){
        int counter = 0;
        while(counter < 10){
            System.out.println(counter);
            counter++;
        }
    }
}
*/

/* 
import java.util.*;

public class Loop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int counter = 1;
        while(counter <= num){
            System.out.print(counter + " ");
            counter++;
        }

    }
}
*/

//Print sum of first  natural number
/* 
import java.util.*;

public class Loop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int range = sc.nextInt();
        int sum = 0;
        int counter = 1;
        while(counter <= range){
            sum = sum + counter;
            counter++;
        } 
        System.out.println("Sum of 1 to "+range + " is :" + sum);
    }
}
*/

/* 
public class Loop{
    public static void main(String[] args){
        //int i=1;
        for(int i=1; i<=10; i++) {
            System.out.println("Hello world");
        }
    }
}
*/
//make square pattern
/* 
public class Loop{
    public static void main(String[] args){
        for(int line=1; line <= 4; line++){
            System.out.println("* * * *");
        }
    }
}
*/

//Print reverse of a number
/* 
public class Loop{
    public static void main(String[] args){
        int n = 15082007;
        while(n > 0){
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }
    }
}
*/
//keep entering numbers till user enter a multiple of 10.

import java.util.*;
public class Loop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter your number :");
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
        } while(true);
    }
}
