//Question 1 :Print the number of 7’s that are in the 2d array.
//Example :Input - int[][] array = { {4,7,8},{8,8,7} };
//Output - 2
/* 
import java.util.Scanner;

public class Ques7 {
    public static int count(int matrix[][], int key){
        int count = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(key == matrix[i][j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int matrix[][] = { {4,7,8},{8,8,7} };
        int n = matrix.length, m =matrix[0].length;
        //print array
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("count of key is "+count(matrix, 7));
    }
}
*/

//Question 2 :Print out the sum of the numbers in the second row of the “nums” array.
//Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
//Output - 18
/* 
import java.util.*;
public class Ques7{
    public static int sum(int matrix[][]){
        int sum = 0;
        for(int j=0; j<matrix[0].length; j++){
            sum += matrix[1][j];
        }
        return sum;
    }
    public static void main(String args[]){
        int nums[][]={ {1,4,9},{11,4,3},{2,2,3} };
        System.out.print(sum(nums));
    }
}
*/

//Question 3 :Write a program to Find Transpose of a Matrix.
//What is Transpose?
//Transpose of a matrix is the process of swapping the rows to columns.
//For a 2x3 matrix,
//Matrix a11    a12    a13
//       a21    a22    a23

//Transposed Matrix a11    a21
//                  a12    a22
//                  a13    a23
import java.util.*;
public class Ques7{
    public static void main(String args[]){
        int row = 2, column = 3;
        int matrix[][] ={{2,3,7},
                         {5,6,7}};

        //Display original matrix
        printMatrix(matrix);

        //Transpose the matrix
        int transpose[][] = new int[column][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                transpose[j][i] = matrix[i][j];
            }
        } 
        //print transpose matrix
        printMatrix(transpose);
    }
    public static void printMatrix(int matrix[][]){
        System.out.println("The matrix is :");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}