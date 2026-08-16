//Creating Array
/* 
public class array {
    public static void main(String args[]){
        int marks[] = new int[50];
        int numbers[] = {1,2,3};
        int moreNumber[] = {4,5,6};
        String fruits[] = {"apple","mango","orange"};
    }
}
*/
//input output and update
/* 
import java.util.*;

public class array{
    public static void main(String args[]){
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("length of array : " + marks.length);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("PHYSICS :"+marks[0]);
        System.out.println("CHHEMISTRY :"+marks[1]);
        System.out.println("MATH :"+marks[0]);

        marks[2]= 100;
        System.out.println("MATH :"+marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3 ;
        System.out.println("percentage is " + percentage + "%");
    }
}
*/
/* 
public class array{
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]){
        int marks[] = {97, 98, 99};
        update(marks);

        //print array
        for(int i =0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
    }
}
*/
//Linear Search
/*
public class array{
    public static int linearSearch(int numbers[],int key){
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 10;
        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.print("elements not found");
        }else{
            System.out.print("key is at index :" + index);
        }
    }
}
*/
//Largest number in aaray
/* 
import java.util.*;

public class array{
    public static int largest(int nums[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(largest < nums[i]){
                largest = nums[i];
            }
            if(smallest > nums[i]){
                smallest = nums[i];
            }
        }
        System.out.println("Smallest value is : " +  smallest);
        return largest;
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,6};
        System.out.println("Largest value is : "+largest(nums));
    }
}
*/
//Binary Search
/* 
public class array{
    public static int binary(int nums[] , int key){
        int start = 0;
        int end = nums.length-1;
        while(start<= end ){
            int mid = (start + end)/2;

            //comparision
            if(nums[mid] == key ){
                return mid; 
            }
            if(nums[mid] < key){  //right
                start = mid+1;
            }else{   //left
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {2,4,6,8,12,14};
        int key = 6;
        System.out.println("Element found at index : " + binary(nums, key));
         
    }
}
*/
//Reverse an array
/*
public class array{
    public static void reverse(int nums[]){
        int first = 0;
        int last = nums.length-1;
        while(first < last){
            //swap
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int nums[] = {2,3,4,1,7,6};
        reverse(nums);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
*/
//pairs in array
/* 
public class array{
    public static void pairs(int nums[]){
        int tp = 0;
        for(int i =0; i<nums.length; i++){
            int curr = nums[i];
            for(int j = i+1; j<nums.length; j++){
                System.out.print("(" + curr + "," + nums[j] + " )");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = " + tp);
    }
    public static void main(String args[]){
        int nums[] = {2,4,5,6,8,10};
        pairs(nums);
    }
}
*/
//Print Subarrays
public class array{
    public static void subarray(int numbers[]){
        int ts= 0 ;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++ ){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarray = " + ts);
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        subarray(numbers);
    }
}