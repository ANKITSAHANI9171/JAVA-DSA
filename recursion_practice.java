//1. Print 1 to 10 and 10 to 1
//2.sum 1 to 10
//3.Print Factorial
//4.Fibonacci Sequence
//5.Sum of array element

public class recursion_practice{
    //print 1 to 10
    static void printNum(int n){
        if(n == 1){
            System.out.print(n + " ");
        }else{
            printNum(n - 1);
            System.out.print(n + " ");
        }
    }
    //print 10 to 1
    static void printNum2(int n){
        if(n == 1){
            System.out.println(n);
        }else{
            System.out.print(n + " ");
            printNum2(n - 1);
        }
    }
    
    //sum of 1 to 10
    static int printSum(int n){
        if(n == 1){
            return 1;
        }else{
            return n + printSum(n - 1);
        }
    }

    //Print Factorial
    static int factorial(int n){
        if(n == 1){
            return 1;
        }else{
            return n * factorial(n -1);
        }
    }

    //4.Fibonacci Sequence
    static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    //5.Sum of array element
    static int sumArr(int arr[] , int n){
        if(n <= 0){
            return 0; 
        }else{
            return arr[n-1] + sumArr(arr, n-1);
        }

    }

    public static void main(String args[]){
        printNum(10);
        System.out.println();
        printNum2(10);
        System.out.println(printSum(10));
        System.out.println(factorial(5));
        System.out.println(fibonacci(6));
        for(int i=0; i<=10; i++){
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        int arr[] = {1,3,4,5};
        System.out.println(sumArr(arr, arr.length));
    }
}