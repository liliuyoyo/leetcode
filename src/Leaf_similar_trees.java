import java.util.ArrayList;

public class Leaf_similar_trees {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> r1 = new ArrayList<>();
        ArrayList<Integer> r2 = new ArrayList<>();
        getLeaves(root1,r1);
        getLeaves(root2,r2);
        return r1.equals(r2);
    }

    public void getLeaves(TreeNode root,ArrayList<Integer> leaves){
        if(root == null){return;}
        if(root.left == null && root.right==null){
            leaves.add(root.val);}
        if(root.left !=null){
            getLeaves(root.left,leaves);
        }
        if(root.right !=null){
            getLeaves(root.right,leaves);
        }
    }
}
