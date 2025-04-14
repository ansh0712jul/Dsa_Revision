package binaryTree;

public class Construct_String_from_Binary_Tree {
    
}



class Solution {
    public String tree2str(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }

    private void buildString(TreeNode root, StringBuilder sb) {
        if (root == null) return;

        sb.append(root.val);

        if (root.left != null || root.right != null) {
            sb.append('(');
            buildString(root.left, sb);
            sb.append(')');
        }

        if (root.right != null) {
            sb.append('(');
            buildString(root.right, sb);
            sb.append(')');
        }
    }
}
