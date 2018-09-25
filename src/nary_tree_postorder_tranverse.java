import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class nary_tree_postorder_tranverse {
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}

    class Solution {
        public List<Integer> postorder(Node root) {
            List<Integer> result = new ArrayList<>();
            Stack<Node> tmp = new Stack<>();
            if(root == null){
                return result;
            }
            tmp.push(root);
            while(!tmp.isEmpty()){
                root = tmp.pop();
                result.add(root.val);
                for(Node n:root.children){
                    tmp.push(n);
                }
            }
            Collections.reverse(result);
            return result;
        }
    }
}
