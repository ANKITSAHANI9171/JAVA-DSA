/* 
//Operations
public class BitManupulation {
    public static void main(String args[]){
        //AND 
        System.out.println(5 & 6);
        //OR
        System.out.println(5 | 6);
        //XOR
        System.out.println(5 ^ 6);
        //One's Complement
        System.out.println(~5);
        System.out.println(~0);
        //Left Shift
        System.out.println(5<<2);
        //Right Shift
        System.out.println(6>>1);
    }
}
*/

/* 
//Check if number is Odd or Even
public class BitManupulation {
    public static void OddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String args[]){
        OddOrEven(3);
        OddOrEven(11);
        OddOrEven(14);
    }
}
*/

//OPerations - GET Ith Bit / Set Ith Bit / Clear Ith Bit / Update Ith Bit 
public class BitManupulation {
    public static int getIthBit(int n , int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int SetIthBit(int n , int i){
        int bitMask = 1<<i;
        return n | bitMask ;
    }
    public static int ClearIthBit(int n,int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int UpdateIthBit(int n , int i, int newBit){
        if(newBit == 0){
            return ClearIthBit(n, i);
        }else{
            return SetIthBit(n, i);
        }
    }
    public static int ClearLastIBit(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static int ClearBitsInRange(int n , int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    //Check if a number is a power of 2 or not
    public static boolean isPowerOfTwo(int n){
        return (n &(n-1)) == 0;
    }

    //Count set bits
    public static int CountSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println(getIthBit(10, 2));
        System.out.println(SetIthBit(10, 2));
        System.out.println(ClearIthBit(10, 1));
        System.out.println(UpdateIthBit(10,2,1));
        System.out.println(ClearLastIBit(15, 2));
        System.out.println(ClearBitsInRange(10, 2, 7));
        System.out.println(isPowerOfTwo(8));
        System.out.println(CountSetBits(10));
    }
}