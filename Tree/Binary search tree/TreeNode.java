    
public class TreeNode {	
	int value;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int val){
		value = val;
		left = null;
		right = null;
	}
	
	public TreeNode(){
		value = 0;
		left = null;
		right = null;
	}
	
	public void setLeft(TreeNode node){
		left=node;
	}
	
	public void setRight(TreeNode node){
		right=node;
	}
	
	public void setValue(int val){
		value = val;
	}
	
	public int getValue(){
		return value;		
	}
	
	public TreeNode getLeft(){
		return left;
	}
	
	public TreeNode getRight(){
		return right;
	}
}

