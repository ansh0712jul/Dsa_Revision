package Implementation;
public class BinaryTree_Client {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.Display();
        tree.find(80);
        System.out.println(tree.max());
        System.out.println(tree.min());
        tree.Preorder();
        tree.Postorder();
        tree.InOrder();
        tree.LevelOrder();
    }
}
