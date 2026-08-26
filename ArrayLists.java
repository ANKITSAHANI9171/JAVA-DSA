import java.util.*;
/* 
//Operations
public class ArrayLists {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();

        //Add Element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //Get Element
        System.out.println(list.get(0));

        //Set ELement of Index
        list.set(1, 10);
        System.out.println(list);

        //Remove
        list.remove(2);
        System.out.println(list);

        //Side of ArrayList
        System.out.println(list.size());

        //Print Reverse
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
*/

/* 
//Find Maximum and Swap 2 Numbers and Sorting

public static void findMax(ArrayList<Integer> list){
    int Max = Integer.MIN_VALUE;
    for(int i=0; i<list.size(); i++){
        if(list.get(i) > Max){
            Max = list.get(i);
        }
    }
    System.out.println("max element = " + Max);
}

public static void swap(ArrayList<Integer> list, int idx1, int idx2){
    int temp = list.get(idx1);
    list.set(idx1, list.get(idx2));
    list.set(idx2, temp);
} 
public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(5);
    list.add(9);
    list.add(8);

    findMax(list);

    System.out.println(list);

    swap(list, 1, 2);
    System.out.println(list);

    //Sorting an ArrayList
    Collections.sort(list);
    System.out.println(list);

    //Reverse Sorting
    Collections.sort(list, Collections.reverseOrder());
    System.out.println(list);
}
*/
/* 
//Mutidimentional ArrayList
public class ArrayLists{
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(4);
        mainList.add(list2);

        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}    
*/

/* 
//Container with Most Water
public class ArrayLists{
    //Brute force O(n^2)
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int ht = Math.min(height.get(i) , height.get(j));
                int width = j - i;
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }
    //2 poinetr Approach O(n)
    public static int storeWater2(ArrayList<Integer> height){
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while(lp < rp){
            //calculate water area
            int ht = Math.min(height.get(lp) , height.get(rp));
            int width = rp-lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            //upadate ptr
            if(height.get(lp) < height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);height.add(8);height.add(6);height.add(2);
        height.add(5);height.add(4);height.add(8);height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
        System.out.println(storeWater2(height));
    }
}
*/


//Pair Sum - 1
//Brute Force
public static boolean pairSum(ArrayList<Integer> list, int target){
    for(int i=0; i<list.size(); i++){
        for(int j=i+1; j<list.size(); j++){
            if(list.get(i) + list.get(j) == target){
                return true;
            }
        }
    }
    return false;
}
//2 Pointer Approach
public static boolean pairSum1(ArrayList<Integer> list, int target){
    int lp=0;
    int rp = list.size()-1;
    while(lp != rp){
        if(list.get(lp) + list.get(rp) == target){
            return true;
        }
        if(list.get(lp) + list.get(rp) < target){
            lp++;
        }else{
            rp--;
        }
    }
    return false;
}

public static void main(String args[]){
    ArrayList<Integer>list = new ArrayList<>();
    list.add(1); list.add(2); list.add(3);list.add(4);
    list.add(5); list.add(6);
    System.out.println(pairSum(list, 5));
    System.out.println(pairSum1(list, 5));
}


