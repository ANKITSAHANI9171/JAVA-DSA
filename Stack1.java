//Stack using colection framework
import java.util.*;
/* 
public class Stack1 {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        //push element
        stack.push(10);
        stack.push(20);
        stack.push(30);

        //View Top element
        System.out.println("Top : " + stack.peek());

        //Remove top element
        System.out.println("popped : " + stack.pop());

        //check if empty
        System.out.println("Is Empty? : " + stack.isEmpty());

        //Display Stack
        System.out.println(stack);
    }
}
*/

//Push at the bottom of the stack
public class Stack1{
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}