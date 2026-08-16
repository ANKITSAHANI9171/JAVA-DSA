//Print holow rectangle pattern
/* 
public class pattern2 {
    public static void hollow_rectangle (int totRow , int totCol){
        for(int i = 1; i <= totRow; i++){
            for(int j = 1; j<= totCol; j++){
                if(i == 1 || i == totRow || j == 1 || j == totCol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow_rectangle(4, 5);
    }
}
*/
//INVERTED & ROTATED HALF-PYRAMID.
/* 
public class pattern2{
    public static void halfPyramid(int n){
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        halfPyramid(4);
    }
}
*/
//inverted half-pyramid with number.
/*
public class pattern2{
    public static void pyraNum(int n){
        for(int i =1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
            
        }
    }
    public static void main(String args[]){
        pyraNum(5);
    }
}
*/
//FLOYDS TRIANGLE
/*
public class pattern2{
    public static void floyds(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(" " +num);
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        floyds(5);
    }
}
*/
//0-1 Triangle
/* 
public class pattern2{
    public static void triangle(int n){
        for(int i =1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum = i + j;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        triangle(5);
    }
}
*/

//Butterfly pattern
/* 
public class pattern2{
    public static void Butterfly( int n){
        //1st half
        for(int i = 1; i <= n; i++){
            //stars - i
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //spaces- 2*(n-i)
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            //stars - i
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i = n; i >= 1; i--){
            //stars - i
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //spaces- 2*(n-i)
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            //stars - i
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Butterfly(5);
    }
}
*/

//Solid rhombus
/* 
public class pattern2{
    public static void rhombus(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        rhombus(7);
    }
}
*/
public class pattern2{
    public static void diamond(int n){
        //first half
        for(int i = 1; i<=n; i++){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for(int i=n; i>=1; i--){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        
        }
        
    }
    public static void main(String args[]){
        diamond(4);
    }
}