//MAX subarray sum -1 (Brute Force) - Complexity = O(n^3). worst case
/* 
public class aray2 {
    public static void MaxSubarraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++ ){
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++){
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }    
            }
        }
        System.out.println("max sum is = " + maxSum);
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        MaxSubarraySum(numbers);
    }
}
*/

//Max Subarray Sum -2 (Prefix sum) - Complexity = o(n^2)
/* 
public class aray2 {
    public static void MaxSubarraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int [numbers.length];
        
        prefix[0] = numbers[0];
        //calculate prefix
        for(int i = 1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++ ){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                
                if(maxSum < currSum){
                    maxSum = currSum;
                }    
            }
        }
        System.out.println("max sum is = " + maxSum);
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        MaxSubarraySum(numbers);
    }
}
*/

//Max Subarray Sum-3 -(Kadane's Algo) - Complexity = O(n) best case.
/* 
import java.util.*;
public class aray2{
    public static void kadane(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Our max subarray sun is : " + ms);
    }
    public static void main(String args[]){
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadane(numbers);
    }
}
*/

//Trapping RainWater
/*
import java.util.*;
public class aray2{
    public static int trappedRainWater(int height[]){
        int n = height.length;
        //calculate the left max boundary- array
        int leftMax[] = new int [n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        //calculate the right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1] );
        }
        int trappedWater = 0;
        //loop
        for(int i = 0; i<n; i++){

            //waterlevel =min(leftmax boundary , rigthtmax boundary)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);

            //trapped water = waterlevel - height[i]
            trappedWater += waterlevel - height[i]; 
        }
        return trappedWater;
    }
    public static void main(String args[] ){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(height));
    }
}
*/
//Buy & Sell Stocks
import java.util.*;
public class aray2{
    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit =0;
        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4}; 
        System.out.println(buyAndSellStocks(prices));
    }
}