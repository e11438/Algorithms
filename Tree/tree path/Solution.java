import java.util.Stack;

public class Solution {
	public int maxPathSum(TreeNode root) {
		int max[] = new int[1]; 
		max[0] = Integer.MIN_VALUE;
		calculateSum(root, max);
		return max[0];
	}
 
	public int calculateSum(TreeNode root, int[] max) {
		if (root == null)
			return 0;
 
		int left = calculateSum(root.left, max);
		int right = calculateSum(root.right, max);
 
		int current = Math.max(root.val, Math.max(root.val + left, root.val + right));
 
		max[0] = Math.max(max[0], Math.max(current, left + root.val + right));
 
		return current;
	}
	
	//method to get max depth of a tree
	public int maxDepth(TreeNode root) {
	    Stack<TreeNode> nodes = new Stack<TreeNode>();
	    Stack<Integer> depths= new Stack<Integer>();
	    nodes.push(root);
	    depths.push(1);
	    int max = 0;

	    while(!nodes.isEmpty()) {
	        TreeNode node = nodes.pop();
	        int depth = depths.pop();
	        if (node == null) continue;
	        if (depth > max) max = depth;
	        nodes.push(node.left);
	        depths.push(depth+1);
	        nodes.push(node.right);
	        depths.push(depth+1);
	    }

	    return max;
	}
}