package TreePractice;

import java.util.Stack;

/**
 * Created by Kai on 2017/11/20.
 */
public class MergeTwoBinaryDemo {
    public static void main(String[] args) {
        Node tree1 = new Node(1);
        tree1.addLeftNode(3);
        tree1.left.addLeftNode(5);
        tree1.addRightNode(2);
        RecursiveTrack.PreOrder(tree1);
        System.out.println("\n================");
        Node tree2 = new Node(2);
        tree2.addLeftNode(1);
        tree2.left.addRightNode(4);
        tree2.addRightNode(3);
        tree2.right.addRightNode(7);
        RecursiveTrack.PreOrder(tree2);
        System.out.println("\n================");
        MergeTwoBinaryDemo mergeTwoBinaryDemo = new MergeTwoBinaryDemo();
        Node tree3 = mergeTwoBinaryDemo.toMergeTree(tree1,tree2);
        System.out.println("\n==tree3用遞迴==");
        RecursiveTrack.PreOrder(tree3);
        System.out.println("\n==(tree2 + tree3)用迴圈==");
        MergeTwoBinaryDemo mergeTwoBinaryDemo1 = new MergeTwoBinaryDemo();
        Node tree4 = mergeTwoBinaryDemo1.toMergeTreeIterative(tree1,tree2);
        RecursiveTrack.PreOrder(tree4);
    }
    public Node toMergeTree(Node T1,Node T2){   //Recursive
        if(T1==null){
            return T2;
        }
        if(T2==null){
            return T1;
        }
        T1.value += T2.value;
        T1.left = toMergeTree(T1.left,T2.left);
        T1.right = toMergeTree(T1.right,T2.right);
        return T1;
    }
    public Node toMergeTreeIterative(Node T1,Node T2){
        if(T1==null){
            return T2;
        }
        Stack<Node[]> stack = new Stack<>();
        stack.push(new Node[]{T1,T2});
        while(!stack.isEmpty()){
            Node[] t = stack.pop();
            if(t[0]==null||t[1]==null){
                continue;
            }
            t[0].value += t[1].value;
            if(t[0].left==null){
                t[0].left = t[1].left;
            }else{
                stack.push(new Node[]{t[0].left,t[1].left});
            }
            if(t[0].right==null){
                t[0].right = t[1].right;
            }else{
                stack.push(new Node[]{t[0].right,t[1].right});
            }
        }
        return T1;
    }
}
