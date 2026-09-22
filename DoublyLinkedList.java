class DoublyLinkedList {

    // Node class
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    // 1. Insert at beginning
    void insertAtBeginning(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // 2. Insert at end
    void insertAtEnd(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // 3. Insert at a specific position
    void insertAtPosition(int data, int position) {

        if (position == 1) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        // If inserting at end
        if (temp == tail) {
            insertAtEnd(data);
            return;
        }

        newNode.next = temp.next;
        newNode.prev = temp;

        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // 4. Delete from beginning
    void deleteFromBeginning() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // 5. Delete from end
    void deleteFromEnd() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // 6. Delete from a specific position
    void deleteFromPosition(int position) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (position == 1) {
            deleteFromBeginning();
            return;
        }

        Node temp = head;

        for (int i = 1; i < position && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        if (temp == tail) {
            deleteFromEnd();
            return;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    // 7. Display forward
    void displayForward() {

        Node temp = head;

        System.out.print("Forward: ");

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    // 8. Display backward
    void displayBackward() {

        Node temp = tail;

        System.out.print("Backward: ");

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }

        System.out.println("NULL");
    }

    // 9. Search an element
    void search(int value) {

        Node temp = head;
        int position = 1;

        while (temp != null) {

            if (temp.data == value) {
                System.out.println(value + " found at position " + position);
                return;
            }

            temp = temp.next;
            position++;
        }

        System.out.println(value + " not found");
    }

    // 10. Find size
    int size() {

        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // Main method
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        // Insert operations
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.displayForward();
        list.displayBackward();

        // Insert at position
        list.insertAtPosition(25, 3);

        list.displayForward();

        // Search
        list.search(30);

        // Size
        System.out.println("Size = " + list.size());

        // Delete operations
        list.deleteFromBeginning();
        list.displayForward();

        list.deleteFromEnd();
        list.displayForward();

        list.deleteFromPosition(2);
        list.displayForward();

        list.displayBackward();
    }
}