package tree;
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

    
}
