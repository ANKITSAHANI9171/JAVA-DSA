//Q1.In a program, input 3 numbers: A, B and C. You have to output the average of these 3 numbers

/*
import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a +b +c;
        int avg = sum / 3 ;
        System.out.println(avg);
    }
}
*/

//Q2. In a program, input the side of a square. You have to output the area of the square.

/* 
import java.util.*;

public class Ques1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float side1 = sc.nextFloat();
        float side2 = sc.nextFloat();
        float area = side1 * side2;
        System.out.println(area);
    }
}
*/

//Enter cost of 3 items from the user (using float data type)- a pencil, a pen
// and an eraser. You have to output the total cost of the items back to the user
// as their bill.

import java.util.*;

public class Ques1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float totalcost = pencil + pen + eraser ;
        System.out.println("total cost of your items is "+totalcost );
    }
}