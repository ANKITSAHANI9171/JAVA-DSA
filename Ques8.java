//Strings
//Count how many times lowercase vowels occurred in a String entered
// by the user.
/* 
import java.util.*;
public class Ques8 {
    public static int LowerVowels(String str){
        int count = 0;
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        System.out.println(LowerVowels(str));
    }
}
*/
//Question 4 :Determine if 2 Strings areanagramsof each other.
// What are anagrams?
// If two strings contain the same characters but in a different order,
// they can be said to be anagrams. Consider race and care.
// In this case, race's characters can be formed into a study,
// or care's characters can be formed in to race.Below is a java program
// toc heck if two strings are anagrams or not.

import java.util.Arrays;
public class Ques8 {
    public static void main(String args[]){
        String str1 = "earth";
        String str2 = "heart";

        //convert Syring to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //first check if length are same
        if(str1.length() == str2.length()){
            //convert string into char
            char[] str1charArray = str1.toCharArray();
            char[]  str2charArray = str2.toCharArray();
            //short the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            boolean result = Arrays.equals(str1charArray , str2charArray);
            if(result){
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        } else {
            //case when length are not equal
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }

    }
}
