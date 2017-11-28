package TreePractice;

/**
 * 反轉二元樹
 */
public class InvertTree {
    public static TreeNode toInvertTree(TreeNode root){
        if(root==null||(root.getLeft()==null&&root.getRight()==null)){
            return root;
        }else {

            TreeNode temp;
            temp = root.left;
            root.left = toInvertTree(root.right);
            root.right = toInvertTree(temp);

            return root;
        }

    }
}
