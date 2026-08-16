//Basic Function
/* 
import java.util.*;

    public static int calculateSum(int a,int b){  //parameters

    int sum = a + b;
    return sum;
    }
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b); //arguments
        System.out.println("sum is " + sum);
    }

*/
//Find product of a & b.
/* 
public class function{
    public static int calculateProduct(int a , int b){
        int product = a * b;
        return product;
        
    }
    public static void main(String args[]){
        int a = 7;
        int b = 5;
        int product=calculateProduct(a,b);
        System.out.println("product of a & b is " + product);
    }
}
*/
//Factorial of a number, n
import java.util.*;

public class function{
    public static int calcFact(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int fact = calcFact(n);
        System.out.println(fact);
    }
}