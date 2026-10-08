import java.util.*;
import java.util.LinkedList;
/* 
//Question 1 :
//Generate Binary Numbers
//Given a number N. The task is to generate and print all binary numbers with decimal values from
//1 to N.
public class Ques14 {
    public static void generateBinary(int num){
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while(num --> 0){
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "1");
        }
     }
    public static void main(String[] args){
        int num = 10;
        generateBinary(num);
    }
}
*/
//Question 4 :
//Reversing the first K elements of a Queue
//We have an integer k and a queue of integers, we need to reverse the order of the first k
//elements of the queue, leaving the other elements in the same relative order.    
public class Ques14{
    public static void ReverseKQueue(Queue<Integer> q, int k){
        Queue<Integer> firstHalf = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        int size = q.size();
        for(int i=0; i<k; i++){
            firstHalf.add(q.remove());
        }
        while(!firstHalf.isEmpty()){
            s.push(firstHalf.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        while(!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
        }
        for(int i=0; i<size-k; i++){
            q.add(q.remove());
        }
    }
    public static void main(String[] args){
        int k= 5;
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        ReverseKQueue(q , k);
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}