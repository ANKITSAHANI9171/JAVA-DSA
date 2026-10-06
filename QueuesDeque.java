import java.util.*;
import java.util.LinkedList;
/* 
//Basic Operation of Deque
public class QueuesDeque {
    public static void main(String[] args){
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1); //1
        deque.addFirst(2);//1 2 
        deque.addFirst(3);//1 2 3
        deque.addLast(4);// 4 1 2 3
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
    }
}
*/
/* 
//Implementing Stack using Deque
public class QueuesDeque{
    static class Stack{
        static Deque<Integer> deque = new LinkedList<>();

        public static void push(int data){
            deque.addLast(data);
        }
        public static int pop(){
            return deque.removeLast();
        }
        public static int peek(){
            return deque.getLast();
        }
    }
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("peek = " + s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }
}
*/
//Implementing Queue using Deque
public class QueuesDeque{
    static class Queue{
        static Deque<Integer> deque = new LinkedList<>();

        public static void add(int data){
            deque.addLast(data);
        }
        public static int remove(){
            return deque.removeFirst();
        }
        public static int peek(){
            return deque.getFirst();
        }
    }
    public static void main(String[] args){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("peek = " + q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}