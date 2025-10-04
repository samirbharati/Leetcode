class Solution {

    int minDiff = Integer.MAX_VALUE;;
    TreeNode prev;
    void inorder(TreeNode root){
        if(root == null) return;

        inorder(root.left);

        if(prev != null){
            minDiff = Math.min(minDiff, root.val - prev.val);
        }
        prev = root;

        inorder(root.right);
    }

    public int getMinimumDifference(TreeNode root) {
        prev = null;

        inorder(root);

        return minDiff;
        
    }
}
