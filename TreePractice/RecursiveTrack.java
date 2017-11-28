package TreePractice;

/**
 * Created by Kai on 2017/10/26.
 */
public class RecursiveTrack {
    public static void PreOrder(Node root){
        if(root != null){
            System.out.print(root.value + " ");
            PreOrder(root.left);
            PreOrder(root.right);
        }
    }
    public static void PreOrder(TreeNode root){
        if(root != null){
            System.out.print(root.getValue() + " ");
            PreOrder(root.getLeft());
            PreOrder(root.getRight());
        }
    }
    public static void InOrder(TreeNode root){
        if(root != null){
            InOrder(root.getLeft());
            System.out.print(root.getValue()+" ");
            InOrder(root.getRight());
        }
    }
    public static void PostOrder(TreeNode root){
        if(root != null){
            PostOrder(root.getLeft());
            PostOrder(root.getRight());
            System.out.print(root.getValue() + " ");
        }
    }
}
