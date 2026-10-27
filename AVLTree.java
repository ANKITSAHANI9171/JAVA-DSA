/* 
//Sorted array to Balanced BST
public class binarySearchTree2 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data +" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node createBST(int arr[], int st, int end){
        if(st > end){
            return null;
        }
        int mid = (st + end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid +1, end);
        return root;
    }
    public static void main(String args[]){
        int arr[] = {3,5,6,8,10,11,12};
        Node root = createBST(arr, 0, arr.length-1);
        preorder(root);
    }
}
*/

/* 
//Convert BST to Balance BST
import java.util.*;
public class binarySearchTree2{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void getInorder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }
    public static Node createBST(ArrayList<Integer> inorder, int st , int end){
        if(st > end){
            return null;
        }
        int mid = (st + end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, st, mid-1);
        root.right = createBST(inorder, mid +1, end);
        return root;
    }
    public static Node balanceBST(Node root){
        //inorder seq
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        //sorted inorder -> balanced BST
        root = createBST(inorder, 0, inorder.size()-1 );
        return root;
    }
    public static void main(String args[]){
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        root = balanceBST(root);
        preorder(root);
    }
}
*/

/* 
//Sizee of Largest BST in BT
public class binarySearchTree2{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data =data;
        }
    }
    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;
        public Info(boolean isBST, int size, int min, int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static int maxBST = 0;

    public static Info largesrBST(Node root){
        if(root == null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo = largesrBST(root.left);
        Info rightInfo = largesrBST(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        if(root.data <= leftInfo.max || root.data >= rightInfo.min){
            return new Info(false,size,min,max);
        }
        if(leftInfo.isBST && rightInfo.isBST){
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);
    }
    public static void main(String args[]){
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right= new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        Info info = largesrBST(root);
        System.out.println("largest BST size = " + maxBST);
    }
}
*/

//AVL tree

class Node{
    int key, height;
    Node left, right;
    Node(int key){
        this.key = key;
    }
}
public class AVLTree{
    int height(Node n){
        return n == null ? 0 : n.height;
    }
    int balance(Node n){
        return n == null ? 0: height(n.left) - height(n.right);
    }
    Node rightRotate(Node y){
        Node x = y.left;
        Node t = x.right;
        x.right = y;
        y.left = t;
        y.height = 1 + Math.max(height(y.left), height(y.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));
        return x;
    }
    Node leftRotate(Node x){
        Node y = x.right;
        Node t = y.left;
        y.left = x;
        x.right = t;
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));    
        return y;       
    }
    Node insert(Node node, int key){
        if(node == null){
            return new Node(key);
        }
        if(key < node.key)
            node.left = insert(node.left, key);
        else if(key > node.key)
            node.right = insert(node.right, key);
        else
            return node;
        node.height = 1 + Math.max(height(node.left),height(node.right));

        int b = balance(node);

        //LL case
        if(b > 1 && key < node.left.key){
            return rightRotate(node);
        }
        //RR case
        if(b < -1 && key > node.right.key){
            return leftRotate(node);
        }
        //LR case
        if(b>1 && key > node.left.key){
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        //RL case
        if(b < -1 && key < node.right.key){
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }
    void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    } 
    public static void main(String args[]){
        AVLTree tree = new AVLTree();
        Node root = null;
        root = tree.insert(root, 30);
        root = tree.insert(root, 20);
        root = tree.insert(root, 10);
        root = tree.insert(root, 25);
        root = tree.insert(root, 40);

        System.out.println("Inorder Traversal: ");
        tree.inorder(root);
    } 
}