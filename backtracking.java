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
/*
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
*/
/* 
//Find Permutation
public class backtracking{
    public static void findPermuatation(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i = 0; i <str.length(); i++){
            char curr = str.charAt(i);
            //"abcde => "ab" + "de" = "abde" 
            String NewStr = str.substring(0,i) + str.substring(i+1);
            findPermuatation(NewStr, ans + curr);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        findPermuatation(str, "");
    }
}
*/
//Grid Ways
public class backtracking{
    public static int gridWays(int i, int j,int n, int m){
        if(i == n-1 && j == m-1){ //condn for last cell
            return 1;
        }else if(i == n || j == n){ //boundry cross condn
            return 0;
        }
        int w1 = gridWays(i+1 , j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1 + w2;
    }
    public static void main (String args[]){
        int n=3, m =3;
        System.out.println(gridWays(0, 0, n, m));
    }
}    