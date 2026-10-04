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
/* 
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
    
    //Q2.Reverse a Stack - this is different question
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return; 
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }

    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);
        reverseStack(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
/* 
//Reverse a String using Stack
public class Stack1{
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder();
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main (String[] args){
        String str = "abc";
        String result = reverseString(str);
        System.out.println(result);
    }
}
*/
//Next Greater Element
public class Stack1{
    public static void main(String[] args){
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            }else{
                nxtGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0; i<nxtGreater.length; i++){
            System.out.println(nxtGreater[i] +" ");
        }
        System.out.println();
    }
}