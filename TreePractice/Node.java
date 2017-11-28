package TreePractice;

/**
 * Created by Kai on 2017/11/16.
 */
public class Node {
    int value;
    Node left,right;
        public Node(int value){
            this.value=value;
            this.left=null;
            this.right=null;
        }
        public void addLeftNode(int value){
            if(this.left==null){
                this.left = new Node(value);
            }else
                System.out.println("已經有節點了");
        }
        public void addRightNode(int value){
            if(this.right==null){
                this.right = new Node(value);
            }else
                System.out.println("已經有節點了");
        }
}

