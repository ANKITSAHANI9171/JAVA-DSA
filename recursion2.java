/* 
//TILING PROBLEM
//Give a "2 * n" board and tiles of a Size "2 * 1", Count the Number of ways to tile the Give
//board using the 2 * 1 tiles (A tile can either be placed horizontally or Vertically).
public class recursion2 {
    public static int tiingProblem(int n){
        //base cse
        if(n == 0 || n == 1){
            return 1;
        }
        //vertical choice
        int fnm1 = tiingProblem(n-1);
        //horizontal choice
        int fnm2 = tiingProblem(n-2);

        int totways = fnm1 + fnm2;
        return totways;
    }
    public static void main(String args[]){
        System.out.println(tiingProblem(3));
        System.out.println(tiingProblem(4));
    }
}
*/
/* 
//Remove Duplicates in a String "appnnacollege"
public class recursion2{
    public static void removeDuplicate(String str, int idx, StringBuilder newStr,boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            //duplicate
            removeDuplicate(str, idx+1, newStr, map);
            }else{
                map[currChar - 'a'] = true;
                removeDuplicate(str, idx+1, newStr.append(currChar), map);
            }
    }
    public static void main(String args[]){
        String str = "appnnacollege";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
*/
/* 
//FRIENDS PAIRING PROBLEM
//Given n friends each one can remain Single oe can be paired up with Some other friend.
//Each friend can be paired only once. find out the total number of ways in which friends
//can remian Single or can be paired up.
public class recursion2{
    public static int friendsPairing(int n){
        if(n == 1 || n ==2){
            return n;
        }
        //choice
        //single
        int fnm1 = friendsPairing(n-1);
        //pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        //totalways
        int totways = fnm1 + pairWays;
        return totways;
    }
    public static void main(String args[]){
        friendsPairing(3);
    }
}
*/
//Binary String Problem 
//-Print all binary Strings of Size N without consecutive ones.
public class recursion2{
    public static void printBinStrings(int n, int lastPlace, String Str){
        //base case
        if(n == 0){
            System.out.println(Str);
            return;
        }
        //kaam
        printBinStrings(n-1, 0, Str + "0");

        if(lastPlace == 0){
            printBinStrings(n-1, 1, Str + "1");
        }
    }
    public static void main(String args[]){
        printBinStrings(3, 0, "");
    }
}