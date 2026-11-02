import java.util.*;
//HashMap
/* 
//Operations in HashMap
public class Hashing {
    public static void main(String args[]){
        //Create 
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert
        hm.put("India", 120);
        hm.put("china", 150);
        hm.put("nepal", 50);

        //Get
        int IndPopulation = hm.get("India");  
        int chinPopulation = hm.get("china");  
        System.out.println(IndPopulation);   //120
        System.out.println(chinPopulation);   //150

        //containsKey
        System.out.println(hm.containsKey("nepal"));  //true
        System.out.println(hm.containsKey("US"));   //false

        //remove
        System.out.println(hm.remove("nepal"));   //50
        System.out.println(hm.remove("US"));      //null
        System.out.println(hm);

        //Size
        System.out.println(hm.size());  //2

        //is Empty
        System.out.println(hm.isEmpty());  //false

        //clear all data
        hm.clear();
        System.out.println(hm.isEmpty());  //true
    }
}
*/

//Iteration on HashMaps
public class Hashing{
    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India" , 100);
        hm.put("China" , 150);
        hm.put("US" , 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal" , 5); 

        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("keys= " + k +", value = "+hm.get(k));
        }
    }
}