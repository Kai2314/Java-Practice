package TreePractice;
/*
建立一個二元搜尋樹，並用前、中後序搜尋
重點在於給一陣列值，直接建立一顆二元樹
 */
public class BinarySearchTree {
    public Node root;
    public BinarySearchTree(){
    root = null;
    }
    public boolean isEmpty(){
        if(root == null){
            return true;
        }
        else
            return false;
    }
    public void insertNode(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }
        Node current = root;
        while (true) {
            if (value < current.value) {
                if(current.left == null){
                    current.left = new Node(value);
                    return;
                }
                else current = current.left;
            }
            else{
                if(current.right == null){
                    current.right = new Node(value);
                    return;
                }
                else current = current.right;
            }
        }
    }
    public void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.value+" ");
        Inorder(root.right);
    }
    public void Preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.value+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public void Postorder(Node root){
        if(root == null){
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.value+" ");
    }

    public static void main(String[] args) {
        int[] array = {5,3,8,6,9,2,31,69,35,54};
        BinarySearchTree createBSTree = new BinarySearchTree();
        for(int i=0;i<array.length;i++){
            System.out.print(" ["+ array[i] + "] ");
            createBSTree.insertNode(array[i]);
        }
        System.out.println();
        System.out.println("===InOrder===");
        createBSTree.Inorder(createBSTree.root);
        System.out.println("\n===PreOrder===");
        createBSTree.Preorder(createBSTree.root);
        System.out.println("\n===PostOrder===");
        createBSTree.Postorder(createBSTree.root);

    }
}
