import java.util.*;

/* 
//Q1.Count Distinct Elements (unique element)
public class Hashing3 {
    public static void main(String args[]){
        int num[] = {4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<num.length; i++){
            set.add(num[i]);
        }
        System.out.println ("ans = "+set.size());

        //OR
        // int count =0;
        // for(Integer n : set){
        //     count++;
        // }
        // System.out.println(count);
    }
}
*/

/* 
//Q2. Union & Intersection of 2 arrays
//Union -> unique element
//intersection -> common element
public class Hashing3{
    public static void main(String args[]){
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        HashSet<Integer> set = new HashSet<>();

        //Union
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }
        System.out.println("Union of both array is = " + set.size());

        //Intersection
        set.clear();

        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        int count =0;
        for(int i=0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }
        System.out.println("intersection of both array is = "+ count);
    }
}
*/

/* 
//Q3. Find Itinerary from Tickets
public class Hashing3{
    public static String getStart(HashMap<String, String> tickets){
        HashMap<String,String> revMap = new HashMap<>();

        for(String key : tickets.keySet()){
            revMap.put(tickets.get(key),key);
        }
        for(String key : tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key; //starting point
            }
        }
        return null;
    }
    public static void main(String args[]){
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print(start);
        for(String key : tickets.keySet()){
            System.out.print(" -> "+ tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
    }
}
*/

/* 
//Largest subarray with 0 sum
public class Hashing3{
    public static void main(String args[]){
        int arr[] = {15,-2,2,-8,1,7,10,23};

        HashMap<Integer, Integer> map = new  HashMap<>();
        //(sum,idx)
        int sum =0;
        int len =0;

        for(int j=0; j<arr.length; j++){
            sum += arr[j];
            if(map.containsKey(sum)){
                len = Math.max(len, j-map.get(sum));
            }else{
                map.put(sum, j);
            }
        }
        System.out.println("largest subarray with sum as 0 => " + len);
    }
}
*/

//Subarray sum equal to K
public class Hashing3{
    public static void main(String args[]){
        int arr[] = {10, 2, -2, -20, 10};
        int k = -10;

        HashMap<Integer, Integer> map = new HashMap<>();

        //(sum,count)
        map.put(0,1);

        int sum = 0;
        int ans = 0;

        for(int j=0; j<arr.length; j++){
            sum += arr[j]; //sum(j)
            if(map.containsKey(sum-k)){
                ans += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0) +1);
        }
        System.out.println(ans);
    }
}
