/*
public class linkedList {
    public static void main(String[] args){
        //creating a LinkList Manually
        class Node{
            int data;
            Node next;

            Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        //Create Some Node
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next= second;
        second.next = third;
        third.next = null;

        System.out.print(first.data + " ");
        System.out.print(second.data + " ");
        System.out.print(third.data);

        System.out.println();

        //Traversing a linkedlist
        Node current = first;

        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
*/

/* 
//Add at the beginning
//Add at the end
//Add at a specific position
public class LinkedListExample {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // 1. Add node at the beginning
    void addFirst(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // 2. Add node at the end
    void addLast(int data) {
        Node newNode = new Node(data);

        // If Linked List is empty
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        // Go to the last node
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // 3. Add node at a specific position
    void addAtPosition(int data, int position) {

        Node newNode = new Node(data);

        // Position 1 means beginning
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        // Move to position - 1
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        // Invalid position
        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display Linked List
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    // Main method
    public static void main(String[] args) {

        LinkedListExample list = new LinkedListExample();

        // Add at beginning
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);

        System.out.println("After adding at beginning:");
        list.display();

        // Add at end
        list.addLast(40);
        list.addLast(50);

        System.out.println("After adding at end:");
        list.display();

        // Add at position
        list.addAtPosition(25, 3);

        System.out.println("After adding 25 at position 3:");
        list.display();
    }
}
*/

/* 
//Remove from the beginning
//Remove from the end
//Remove from a specific position
public class LinkedListExample2 {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // ==============================
    // ADD NODE AT BEGINNING
    // ==============================
    void addFirst(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // ==============================
    // ADD NODE AT END
    // ==============================
    void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // ==============================
    // REMOVE NODE FROM BEGINNING
    // ==============================
    void removeFirst() {

        // If Linked List is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }

    // ==============================
    // REMOVE NODE FROM END
    // ==============================
    void removeLast() {

        // If Linked List is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If only one node exists
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        // Go to second-last node
        while (temp.next.next != null) {
            temp = temp.next;
        }

        // Remove last node
        temp.next = null;
    }

    // ==============================
    // REMOVE NODE FROM SPECIFIC POSITION
    // ==============================
    void removeAtPosition(int position) {

        // If list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Remove first node
        if (position == 1) {
            head = head.next;
            return;
        }

        Node temp = head;

        // Move to position - 1
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        // Invalid position
        if (temp == null || temp.next == null) {
            System.out.println("Invalid Position");
            return;
        }

        // Remove the node
        temp.next = temp.next.next;
    }

    // ==============================
    // DISPLAY LINKED LIST
    // ==============================
    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    // ==============================
    // MAIN METHOD
    // ==============================
    public static void main(String[] args) {

        LinkedListExample2 list = new LinkedListExample2();

        // Adding nodes
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        System.out.println("Original Linked List:");
        list.display();

        // Remove from beginning
        list.removeFirst();

        System.out.println("After removing first node:");
        list.display();

        // Remove from end
        list.removeLast();

        System.out.println("After removing last node:");
        list.display();

        // Remove from position 2
        list.removeAtPosition(2);

        System.out.println("After removing node from position 2:");
        list.display();
    }
}
*/
/* 
//Check if LinkedList ia a Palindrome
public class LinkedListPalindrome {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Add node at end
    void addLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Check Palindrome
    boolean isPalindrome() {

        // Empty list or single node
        if (head == null || head.next == null) {
            return true;
        }

        // Find middle using slow and fast pointers
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow);

        // Compare first half and second half
        Node firstHalf = head;
        Node temp = secondHalf;

        while (temp != null) {

            if (firstHalf.data != temp.data) {
                return false;
            }

            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        return true;
    }

    // Reverse Linked List
    Node reverse(Node head) {

        Node previous = null;
        Node current = head;

        while (current != null) {

            Node next = current.next;

            current.next = previous;

            previous = current;
            current = next;
        }

        return previous;
    }

    // Display Linked List
    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        LinkedListPalindrome list = new LinkedListPalindrome();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);

        System.out.println("Linked List:");
        list.display();

        if (list.isPalindrome()) {
            System.out.println("The Linked List is a Palindrome");
        } else {
            System.out.println("The Linked List is NOT a Palindrome");
        }
    }
}
*/

//Remove Cycle in LinkedList
public class LinkedList {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Remove Cycle
    void removeCycle() {

        // Step 1: Detect cycle
        Node slow = head;
        Node fast = head;

        boolean cycleExists = false;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycleExists = true;
                break;
            }
        }

        // No cycle
        if (!cycleExists) {
            System.out.println("No Cycle Found");
            return;
        }

        // Step 2: Find starting point of cycle
        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // slow and fast are now at cycle starting point
        Node cycleStart = slow;

        // Step 3: Find last node of cycle
        Node temp = cycleStart;

        while (temp.next != cycleStart) {
            temp = temp.next;
        }

        // Remove cycle
        temp.next = null;

        System.out.println("Cycle Removed");
    }

    // Display Linked List
    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        // Create nodes
        list.head = new Node(1);

        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // Connect nodes
        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Create cycle
        fifth.next = third;

        // Remove cycle
        list.removeCycle();

        // Display list
        list.display();
    }
}