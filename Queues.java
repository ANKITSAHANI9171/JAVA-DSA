import java.util.*;
import java.util.LinkedList;
/* 
//Basic Operation
public class Queues {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println("Peek = " + q.peek());
        q.remove();
        System.out.println("Peek ="  + q.peek());
        while(!q.isEmpty()){
            System.out.println(q.remove());
        } 
    }
}
*/
/* 
//Queues Using Array
public class Queues{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        //add
        public static void add(int data){
            if(rear == size-1){
                System.out.println("queue is Full");
                return; 
            }
            rear = rear + 1;
            arr[rear] = data;
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];

            }
            rear = rear -1;
            return front;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
*/
/* 
//Queue using 2 Stacks
public class Queues {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        //add
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue empty");
                return -1;
            }
            return s1.pop();
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
*/
/* 
//Stack using 2 Queues
public class Queues {
    public static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();
        
        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
        }
        public static int pop(){
            if(isEmpty()){
                System.out.println("empty Stack");
                return -1;
            }
            int top = -1;
            //Case 1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }else{  //case 2
                while(!q2.isEmpty()){
                    top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty Stack");
                return -1;
            }
            int top = -1;
            //Case 1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    q2.add(top);
                }
            }else{  //case 2
                while(!q2.isEmpty()){
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}    
*/
/* 
//First non-repeating letter in a Stream of Characters ->aabccxb
public class Queues{
    public static void printNonRepeating(String str){
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            
            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1 + " ");
            }else{
                System.out.print(q.peek() + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        String str = "aabccxb";
        printNonRepeating(str);
    }
}    
*/
/* 
//Interleave 2 Halves of a Queue(even length)
//ex -> 1 2 3 4 5 6 7 8 9 10
//op -> 1 6 2 7 3 8 4 9 5 10
public class Queues{
    public static void interleave(Queue<Integer> q){
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();
        for(int i=0; i<size/2; i++){
            firstHalf.add(q.remove());
        }
        while(!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());
        } 
    }
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interleave(q);
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
*/
//Queue Reversal
//ex-> 1 2 3 4 5
//op ->5 4 3 2 1
public class Queues{
    public static void reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverse(q);
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
} 