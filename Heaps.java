import java.util.*;
/* 
//JAVA Program MIN priority Queue
public class Heaps {
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //Insertion
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        System.out.println("Priority Queue : " + pq);

        //Highest priority element
        System.out.println("peek : " + pq.peek());

        //Remove highest priority element
        System.out.println("poll : " + pq.poll());

        System.out.println("After deletion : " + pq);
    }
}
*/

/* 
//MAX priority queue in java
public class Heaps{
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(40);
        pq.add(20);

        System.out.println(pq.peek());
    }
}
*/

/* 
//PQ for Objects
public class Heaps{
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        } 
    }
    public static void main(String args[]){
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove();
        }
    }
}
*/



//HEAP

/* 
//Insert in HEAP
//1.Insert the new element at the end
//2. Compare it with its parent.
//3. Swap if the Heap property is violated
//4. Repeat until the correct position reached.
public class Heaps{
    ArrayList<Integer> arr = new ArrayList<>();
    public void add(int data){
        //add at last idx.
        arr.add(data);
        int x = arr.size()-1; //x is child index
        int par = (x-1)/2; //parent index

        while(arr.get(x) < arr.get(par)){
            //swap
            int temp = arr.get(x);
            arr.set(x, arr.get(par));
            arr.set(par, temp);

            x = par;
            par =(x-1)/2;
        }
    }
    //peek from HEAP
    public int peek(){
        return arr.get(0);
    }
    //Check Empty
    public boolean isEmpty(){
        return arr.size() == 0;
    }
    public static void main(String args[]){
        Heaps h = new Heaps();
        h.add(2);
        h.add(4);
        h.add(1);
        h.add(5);
        System.out.println(h.peek());
    }
}
*/

/* 
//Remove from Heap
//1. Remove the root element
//2. Replace it with the last element
//3. Compare it with its children.
//4. Swap with the appropriate child
//5. Repeat until the Heap priority is restored. 
public class Heaps{
    ArrayList<Integer> arr = new ArrayList<>();
    public void add(int data){
        //add at last idx.
        arr.add(data);
        int x = arr.size()-1; //x is child index
        int par = (x-1)/2; //parent index

        while(arr.get(x) < arr.get(par)){
            //swap
            int temp = arr.get(x);
            arr.set(x, arr.get(par));
            arr.set(par, temp);

            x = par;
            par =(x-1)/2;
        }
    }
    private void heapify(int i){
        int left = 2*i+1;
        int right = 2*i+2;
        int minIdx = i;
        
        if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
            minIdx = left;
        }
        if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
            minIdx = right;
        }
        if(minIdx != i){
            //swap
            int temp = arr.get(i);
            arr.set(i, arr.get(minIdx));
            arr.set(minIdx, temp);

            heapify(minIdx);
        }
    }
    public int remove(){
        int data = arr.get(0);

        //Step1 - Swap first & last
        int temp = arr.get(0);
        arr.set(0, arr.get(arr.size() -1));

        //Step2 - delete last
        arr.remove(arr.size()-1);

        //step3 - heapify
        heapify(0);
        return data;
    }
    public boolean isEmpty(){
        return arr.size() == 0;
    }
    public int peek(){
        return arr.get(0);
    }
    public static void main(String args[]){
        Heaps h = new Heaps();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
*/

//HEAP Sort
//1. Built a Max Heap
//2. Swap the root(largest element) with the last element
//3. Heapify the remainig elements.
//4. Repeat until the array is Sorted/
public class Heaps{
    public static void heapify(int arr[], int i, int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx = i;
        if(left < size && arr[left] > arr[maxIdx]){
            maxIdx = left;
        }
        if(right < size && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }
        if(maxIdx != i){
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
            heapify(arr, maxIdx, size);
        }
    }
    public static void heapSort(int arr[]){
        //step1 - build maxHeap
        int n = arr.length;
        for(int i=n-1; i>0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }
    }
    public static void main (String args[]){
        int arr[] = {1,2,4,5,3};
        heapSort(arr);

        //print
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
