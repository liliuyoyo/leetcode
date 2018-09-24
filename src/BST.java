public class BST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if(root.val == val){
            return root;
        }
        if(root.left !=null && root.left.val==val){
            return root.left;
        }
        if(root.right !=null && root.right.val==val){
            return root.right;
        }
        TreeNode t= null;
        if(root.left != null){
            t= searchBST(root.left,val);
        }
        if(t==null && root.right !=null){
            t= searchBST(root.right,val);
        }
        return t;
    }
}


    /*public TreeNode searchBST(TreeNode root, int val) {
        while(root != null && root.val != val){
            root = val<root.val? root.left:root.right;
        }
        return root;
    }*/

    /*public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return root;
        if(root.val == val){
            return root;
        }
        else{
            return val<root.val? searchBST(root.left,val):searchBST(root.right,val);
        }
    }*/