import java.util.*;
/*
//LinkedHashMap -> Keys are insertion ordered
public class Hashing2 {
    public static void main(String args[]){
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China" , 150);
        lhm.put("US" , 50);

        System.out.println(lhm);
    }
}
*/

/* 
//TreeMap -> keys are sorted
public class Hashing2{
    public static void main(String args[]){
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China" , 150);
        tm.put("US" , 50);

        System.out.println(tm);
    }
}
*/

/* 
//Q1. Majority Element
//Given an integer of array of size n, 
//find all elements that appear more than [n/3] times.
public class Hashing2{
    public static void main(String args[]){
        int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }

            //Or use this shortcut
            //map.put(arr[i], map.getOrDefault(arr[i], defaultValue: 0) +1);
        }

        for(Integer key : map.keySet()) {
            if(map.get(key) > arr.length/3){
                System.out.println(key);
            }
        }
    }
}
*/

/* 
//Q2.Valid Anagram
//Given two strings s and t, return true if t is an anagram of s,
//and false otherwise. An Anagram is a word or phrase formed by rearranging 
//the letters of a different word or phrase, typically using all the originalletters exactly once.
public class Hashing2{
    public static boolean isAnagram(String s,String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(map.get(ch) != null){
                if(map.get(ch) == 1){
                    map.remove(ch);
                }else{
                    map.put(ch, map.get(ch) -1);
                }
            } else{
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String args[]){
        String s = "race";
        String t = "care";

        System.out.println(isAnagram(s, t));
    }
}
*/

/* 
//HashSet -> store unique element
public class Hashing2{
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(5);
        set.add(6);
        set.add(5);
        set.add(7);

        System.out.println(set);

        System.out.println(set.size());

        if(set.contains(5)){
            System.out.println("set contains 5");
        }

        set.remove(7);
        if(set.contains(7)){
            System.out.println("set contains 7");
        }

        set.clear();
        System.out.println(set.size());

        System.out.println(set.isEmpty());
    }
}
*/

/* 
//Iteration on HashSet
public class Hashing2{
    public static void main(String args[]){
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        // Iterator it = cities.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        //using advance loop
        for(String city : cities){
            System.out.println(city);
        }
    }
}
*/

/* 
//Linked HashSet -> Ordered using DLL
public class Hashing2{
    public static void main(String args[]){
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        System.out.println(cities);
    }
}
*/

/* 
//TreeSet -> Sorted in ascending order
public class Hashing2{
    public static void main(String args[]){
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(5);
        ts.add(7);
        ts.add(8);

    System.out.println(ts);
    }
}
    */