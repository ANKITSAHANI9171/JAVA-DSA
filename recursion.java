/* 
//Print numbers from n to 1 (Decresing Order)
public class recursion {
    public static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }
//Print number from n to 1 (Incresing Order)
    public static void printInc(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }
    public static void main(String args[]){
        printDec(10);
        printInc(10);
    }
}
*/
/* 
//Print factorial of a number n
public class recursion {
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fn = n * fact(n-1);
        return fn;
    }
    //print sum of first n natural numbers.
    public static int calcSum(int n){
        if(n == 1){
            return 1;
        }
        int Snm1 = calcSum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }
    //Print Nth fibonacci number
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
    public static void main(String args[]){
        System.out.println(fact(5));
        System.out.println(calcSum(5));
        System.out.println(fib(25));
    }
}
*/
/* 
//Check if a given array is Sorted or not
public class recursion{
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String args[]){
        int arr[] = {5,6};
        System.out.println(isSorted(arr, 0));
    }
}
*/
/* 
//WAF to Find the First Occurance of an element in an array
public class recursion{
    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    //WAF to Find the Last Occurance of an element in an array
    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;        
        }
        return isFound;
    }
    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(firstOccurence(arr, 5, 0));
        System.out.println(lastOccurence(arr, 5, 0));
    }
}
*/
//Print X to the power n
public class recursion {
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int xnm1 = power(x, n-1);
        int xn = x * xnm1;
        return xn;
    }
    //print x to the power n (optimized)
    public static int optimizedPower(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;
        //n is odd
        if(n%2 != 0){
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String args[]){
        System.out.println(power(2, 10));
        System.out.println(optimizedPower(2, 5));
    }
}   