/* 
//Backtracking on Array
public class backtracking {
    public static void changeArr(int arr[], int i, int val){
        //Base case
        if(i == arr.length){
            printArr(arr);
            return;
        }
        //recursion
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i] - 2;

    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
*/
//Find Subsets
public class backtracking{
    public static void findSubset(String str, String ans, int i){
        //base case
        if(i == str.length()){
            System.out.println(ans);
            return;
        }

        //recursion
        //Yes choice
        findSubset(str, ans+str.charAt(i), i+1);

        //No choice
        findSubset(str, ans, i+1);

    }
    public static void main(String args[]){
        String str = "abc";
        findSubset(str, "", 0);
    }
}

