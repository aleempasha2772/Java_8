package basic;

class TreeNode{
    private int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data) {
        this.data = data;
    }
}

public class BinaryTreeMaxDepth {

    public static int maxDepth(TreeNode root){
        if (root == null){
            System.out.println("Empty Tree");
            return -1;
        }else{
            int leftHeight = 0;
            int rightHeight = 0;
            if (root.left != null){
                leftHeight = maxDepth(root.left);
            }
            if (root.right != null){
                rightHeight = maxDepth(root.right);
            }
            int max = (leftHeight > rightHeight) ? leftHeight:rightHeight;
            return (max+1);
        }
    }

    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Maximum depth of binary tree is: " + maxDepth(root));
    }
}
