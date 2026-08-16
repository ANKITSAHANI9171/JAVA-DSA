//Function overloading ->multiple functions with same name but different parameters.
/* 
public class function2 {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a , int b, int c){
        return a+b+c;
    }
    public static void main(String args[]){
        System.out.println(sum(5, 02));
        System.out.println(sum(5,7,3));
    }
    
}
*/
//Check if number is prime or not.

public class function2{
    public static boolean isPrime(int n){
        boolean isPrime =true;
        for(int i =2; i<=n-1; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }    
        }
        return isPrime;
    }

    //primes in range
    public static void inRange(int n){
        for(int i=1; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    //main
    public static void main(String args[]){
        System.out.println(isPrime(6));
        inRange(20);
    }
}