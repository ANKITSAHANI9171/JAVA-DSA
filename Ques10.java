/* 
//Question1: For a given integer array of size N. You have to find all 
//the occurrences(indices) of a given element(Key) and print them.
// Use a recursive function to solve this  problem.
public class Ques10 {
    public static void allOccurence(int arr[] , int key, int i){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.print(i + " ");
        }
        allOccurence(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[] = {3,2,4,5,6,2,7,2,2};
        allOccurence(arr, 2, 0);
    }
}
*/
/* 
//Question 2 :You are given a number (eg -  2019), convert it into a String of english 
// like“two zero one nine”. Use a recursive function to solve this problem.
public class Ques10{
    static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printDigits(int number){
        if(number==0) {
            return;
        }
        int lastDigit = number%10;
        printDigits(number/10);
        System.out.print(digits[lastDigit]+" ");
    }
    public static void main(String[]args) {
        printDigits(1234);
    }
}  
*/
/* 
//Question 3 :Write a program to find Length of a String using Recursion.
public class Ques10{
    public static int Length(String str){
        if(str.length() == 0){
            return 0;
        }
        return Length(str.substring(1)) + 1;
    }
    public static void main(String args[]){
        String str = "Hello";
        System.out.println(Length(str)); 
    }
}
*/
/* 
//Question4: We are given a string S ,we need to fnd the count of all contiguous
// substrings starting and ending with the same character.          
public class Ques10{
    public static int countSubstrs(String str, int i, int j, int n){
        if(n == 1){
            return 1;
        }
        if(n <= 0){
            return 0;
        }
        int res = countSubstrs(str, i +1, j, n-1) +
                  countSubstrs(str, i, j-1, n-1) -
                  countSubstrs(str, i+1, j-1, n-2);
        if(str.charAt(i) == str.charAt(j)){
            res++;
        }
        return res;          
    }
    public static void main(String args[]){
        String str = "abcab";
        int n = str.length();
        System.out.println(countSubstrs(str, 0, n-1, n));
    }
}
*/
/* 
//Question 5 :TOWER OF HANOI(Important!)
//You have 3 towers and N disks of different sizes which can slide on to any tower.
//The puzzle starts with disks sorted in ascending order of size from top to bottom
//(i.e.,eachdisksitsontop of an even larger one).
//You have the following constraints:(1) Only one disk can be moved at a time.
//(2) A disk is slid off the top of one tower onto another tower.
//(3)A disk cannot be placed on top of a smaller disk. Write a program to move
//the disks from the first tower to the last using Stacks.
public class Ques10{
    public static void towerOfHanoi(int n,String src,String helper,String dest) {
        if(n == 1) {
            System.out.println("transfer disk "+ n +"from "+src+" to "+dest);
            return;
        }//transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n-1, src, dest, helper);
        //transfer nth from src to dest
        System.out.println("transfer disk "+ n +"from "+ src +" to "+ helper);
        //transfer n-1 from helper to dest using srcas 'helper'
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String args[]) {
        int n = 4;
        towerOfHanoi(n,"A","B","C");
    }
}        
*/
    