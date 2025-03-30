package Implementation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {

    public class Node {
        int val; 
        Node left;
        Node right;
    }

    Scanner sc = new Scanner(System.in);

    private Node root;

    // constructor for binary tree
    public BinaryTree() {
        root = createTree();    
    }

    private Node createTree() {

        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;

        boolean hasLeftChild = sc.nextBoolean();
        if(hasLeftChild){
            nn.left = createTree();
        }

        boolean hasRightChild = sc.nextBoolean();
        if(hasRightChild){
            nn.right = createTree();
        }
        return nn;
    }

//  Display method visible to user
    public void Display() {
        Display(root);
    }

//    private Display method unvisible to user 
    private void Display( Node node ){

        if(node == null) return ;

        String temp = "";
        temp = "<-- " + node.val + " -->";
        if(node.left != null) temp = node.left.val + temp;
        else temp = "null" + temp;

        if(node.right != null) temp =  temp + node.right.val ;
        else temp =  temp + "null";

        System.out.println(temp);
        Display(node.left);
        Display(node.right);

    }

    public boolean  find(int item) {
        return find( this.root , item );
    }
    private boolean find( Node root , int item){

        // base case
        if(root == null) return false ;

        if(root.val == item) return true;
        boolean left = find(root.left , item);
        boolean right = find(root.right , item);
        return left || right;

    }

    public int max() {
        return max(this.root);
    }

    private int max(Node root){

        if(root == null) return Integer.MIN_VALUE;

        // left call 
        int left = max(root.left);
        int right = max(root.right);
        return Math.max(root.val , Math.max(left , right));

    }

    public int min() {
        return min(this.root);
    }

    private int min(Node root) {

        if(root == null) return Integer.MAX_VALUE;

        int left = min(root.left);
        int right = min(root.right);
        return Math.min(root.val , Math.min(left , right));
    }

    public int height() {
         return height(this.root);
    }

    private int height(Node root) {

        if(root == null) return -1; // or we can return 0 also intstead -1

        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left , right) + 1;
    }

    public void Preorder() {
        Preorder(this.root);
        System.out.println();
    }

    private void Preorder(Node root){
        if(root == null) return;

        System.out.print(root.val + " ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public void Postorder() {
        Postorder(this.root);
        System.out.println();
    }

    private void Postorder(Node root){
        if(root == null) return;

        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.val + " ");
    }

    public void InOrder() {
        InOrder(this.root);
        System.out.println();
    }

    private void InOrder(Node root){
        if(root == null) return;

        InOrder(root.left);
        System.out.print(root.val + " ");
        InOrder(root.right);
        
    }

    // level order traversal on tree

    public void LevelOrder() {
        Queue < Node > q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {

            Node rv = q.poll(); // remove the first element of the queue
            System.out.println(rv.val);
            if(rv.left != null) q.add(rv.left);
            if(rv.right != null) q.add(rv.right);
        }
        System.out.println();
    }

    


    
}
