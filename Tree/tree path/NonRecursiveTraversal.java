import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NonRecursiveTraversal {

    private TreeNode root;

    private static class TreeNode {
        TreeNode left;
        TreeNode right;
        int item;

        TreeNode (TreeNode left, TreeNode right, int item) {
            this.left = left;
            this.right = right;
            this.item = item;
        }
    }

    public void createBinaryTree (Integer[] arr) {
        if (arr == null)  {
            throw new NullPointerException("The input array is null.");
        }
     /*   I would not throw NullPointerException; it indicate that you are trying 
      * to use a variable which is null. Throw IllegalArgumentException instead; 
      * it indicated that arguments provided are not in a legal state.
      */
        root = new TreeNode(null, null, arr[0]);

        final Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        final int half = arr.length / 2;

        for (int i = 0; i < half; i++) {
            if (arr[i] != null) {
                final TreeNode current = queue.poll();
                final int left = 2 * i + 1;
                final int right = 2 * i + 2;

                if (arr[left] != null) {
                    current.left = new TreeNode(null, null, arr[left]);
                    queue.add(current.left);
                }
                if (right < arr.length && arr[right] != null) {
                    current.right = new TreeNode(null, null, arr[right]);
                    queue.add(current.right);
                }
            }
        }
    }

    public void preOrder() {   
        if (root == null) return;

        final Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.add(root);        

        while (!stack.empty()) {
            TreeNode node = stack.pop();           
            System.out.print(node.item + " ");
            // LIFO
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
    }

    public void reverseOrder() {   
        if (root == null) return;

        final Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.add(root);        

        while (!stack.empty()) {
            TreeNode node = stack.pop();           
            System.out.print(node.item + " ");
            // LIFO
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }
    }

    public void inOrder() {
        if (root == null) return;

        final Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;

        while (!stack.isEmpty() || node != null) {
            if (node != null) {
                stack.add(node);
                node = node.left;
            } else {
               node = stack.pop();
               System.out.print(node.item + " "); 
               node = node.right; 
            }
        }
    }


    public void postOrder  () {
        if (root == null) return;

        final Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;

        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                if (node.right != null) stack.add(node.right);
                stack.add(node);
                node = node.left;
            }

            node = stack.pop();

            // (node.right) != null means this node is parent of that tiny subtree
            // stack.pop != null ensures it was not the root.
            if (node.right != null && !stack.isEmpty() && node.right == stack.peek()) {
                TreeNode nodeRight = stack.pop();
                stack.push(node);
                node = nodeRight;
            } else {
                System.out.print(node.item + " ");
                node = null;
            }
        }
    }
}