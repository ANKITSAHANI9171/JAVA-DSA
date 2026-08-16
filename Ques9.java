/* 
public class Ques9 {
    //Question 2 : Swap two numbers without using any third variable.
    public static void main(String[] args) {
        int x = 3, y = 4;
        System.out.println("Before swap: x = " + x + " and y = " + y);
        //swap using xor
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swap: x = " + x + " and y = " + y);
    }
}
*/
/* 
//Question 3 : Add 1 to an integer using Bit Manipulation.
public class Ques9 {
    public static void main(String[] args) {
    int x = 6;
    System.out.println(x + " + " + 1 + " is " + -~x);
    x = -4;
    System.out.println(x + " + " + 1 + " is " + -~x);
    x = 0;
    System.out.println(x + " + " + 1 + " is " + -~x);
    }
}
*/

//Question 4 : Convert uppercase characters to lowercase using bits.
public class Ques9 {
    public static void main(String[] args) {
    // Convert uppercase character to lowercase
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println((char)(ch | ' '));
        }
    }
}
