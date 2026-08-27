//ArrayLists
/* 
//An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
//An Arraylist nums is monotone increasing if for all i<=j,nums.get(i)<=nums.get(j).
//An Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
//Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.

import java.util.ArrayList;

public class Ques13 {
    public static boolean checkMonotonic(ArrayList<Integer> list){
        boolean inc = true;
        boolean dec = true;
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i) > list.get(i+1)){
                inc = false;
            }
            if(list.get(i) < list.get(i+1)){
                dec = false;
            }
        }    
        return inc || dec;  
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(2);list.add(3);
        System.out.println(checkMonotonic(list));
    }
}
*/
/* 
//Question 2 :Lonely Numbers in ArrayList
//You are given an integer array list nums. A number x is lonely when it appears
//only once,and no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.
//Return all lonely numbers in nums. You may return the answer in any order.
import java.util.*;
public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
    Collections.sort(nums);
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=1; i<nums.size()-1; i++) {
        if(nums.get(i-1)+1 < nums.get(i) && nums.get(i)+1 < nums.get(i+1)){
            list.add(nums.get(i));
        }
    }
    if(nums.size() ==1) {
        list.add(nums.get(0));
    }
    if(nums.size() >1) {
        if(nums.get(0)+1 < nums.get(1)) {
            list.add(nums.get(0));
        }
        if(nums.get(nums.size()-2) +1 < nums.get(nums.size()-1)){
            list.add(nums.get(nums.size()-1));
        }
    }
    return list;
}
public static void main(String args[]){
    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(10);nums.add(6);nums.add(5);nums.add(8);
    System.out.println(findLonely(nums));
}
*/
//Question 3:Most Frequent Number following Key
//You are given an integer Arraylist nums.You are also given an integer key,
//which is present in nums.For every unique integer target in nums,count the
//number of times target immediately follows an occurrence of key in nums.
import java.util.*;
public static int mostFrequent(ArrayList<Integer> nums, int key) {
    int[] result = new int[1000];
    for(int i=0;i < nums.size()-1; i++){
        if(nums.get(i) == key){
            result[nums.get(i+1)-1]++;
        }
    }
    int max=Integer.MIN_VALUE;
    int ans=0;
    for(int i=0; i<1000; i++){
        if(result[i] >max){
            max =result[i];
            ans=i+1;
        }
    }
    return ans;
}
public static void main(String args[]){
    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(1);nums.add(100);
    nums.add(200);nums.add(1);
    nums.add(100);
    System.out.println(mostFrequent(nums, 1));

}