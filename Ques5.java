//Question 1: Given an integer array nums, return true if any value appears
// at least twice in the array, and return false if every element is distinct.
/* 
public class Ques5{
    public static boolean checkPair(int nums[]){
        boolean check = false;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    check = true;
                }
            }
        }
        return check;
    }
    public static void main(String args[]){
        int nums[]={1,2,3,1};
        System.out.println(checkPair(nums));
    }
}
*/

//Question 2:There is an integer array nums sorted in ascending order (with distinct values).
//Prior to being passed to your function, nums is possibly rotated at an unknown pivot  
//index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k],
//nums[k+1],  ...,  nums[n-1], nums[0], nums[1], ...,  nums[k-1]] (0-indexed).  
//For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
// Given the array nums after the possible rotation and an integer target, 
// returnthe index oftarget if it is in nums, or -1   if it is not in nums.
// You must write an algorithm with O(log n) runtime complexity.
/*
  //block of code.
 */

//Question 3:You are given an array prices where prices[i] is the price of a given stock on
//the ith day. Return the maximum profit you can achieve from this transaction. 
//If you cannot achieve any profit, return 0.
/* 
import java.util.*;
public class Ques5{
    public static int stock(int prices[]){
        int buyPrice = prices[0];
        int maxProfit = 0;
        for(int i=1; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[] = {7, 1, 5, 3, 6,  4};
        System.out.println(stock(prices));
    }
}
*/
//Question 4:Given n non-negative integers representing an elevation map where the
// width of each bar is 1, compute how much water it can trap after raining.
import java.util.*;
public class Ques5{
    public static int trappedRainWater(int height[]){
        int leftMaxBoundary[] = new int[height.length]; 
        int rightMaxBoundary[] = new int[height.length];
        int trappedWater = 0;

        //calculate leftmax boundary
        leftMaxBoundary[0] = height[0];
        for(int i=1; i<height.length; i++){
            leftMaxBoundary[i] = Math.max(height[i] , leftMaxBoundary[i-1]);
        }

        //calculate rightmax boundary
        rightMaxBoundary[height.length-1] = height[height.length-1];
        for(int i=height.length-2 ; i>=0; i--){
            rightMaxBoundary[i] = Math.max(height[i], rightMaxBoundary[i+1]);
        }  
        //loop
        for(int i=0; i<height.length; i++){
            //waterlevel
            int waterlevel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);

            //trappedwater 
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String args[]){
        int height[] = {4, 2, 0, 3, 2, 5};
        System.out.println(trappedRainWater(height));
    } 
}