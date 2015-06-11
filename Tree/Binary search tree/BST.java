public class BST {	

	private TreeNode root;	

	public BST(){
		root = null;
	}	

	/*method to determine whether BST is empty or not*/
	public boolean isEmpty(){
		return root==null;
	}	

	/*method to insert a node to BST*/
	public void insert(int data){
		root=insert(root,data);
	}	

	private TreeNode insert(TreeNode node,int data){
		if(node==null){
			node = new TreeNode(data);
		}
		else{
			if(data<node.getValue())
				node.left=insert(node.left,data);
			else
				node.right=insert(node.right,data);
		}
		return node;
	}	

	/*method to delete a node from BST*/
	public void delete(int val){
		if(isEmpty()){
			 System.out.println("Tree Empty");
		}
		else if(!search(val))
			System.out.println("Sorry "+ val +" is not present");
		else{
			root=delete(root,val);
			 System.out.println(val+ " deleted from the tree");
		}
	}	

	private TreeNode delete(TreeNode node,int val){
		TreeNode n1,n2,k;		

		if(root.getValue()==val){
			TreeNode lt=root.getLeft();
			TreeNode rt=root.getRight();			

			if(lt==null&&rt==null)
				return null;
			else if(lt==null)
				return rt;
			else if (rt==null)
				return lt;
			else{
				n1=rt;
				n2=rt;
				while(n2.getLeft()!=null)
					n2=n2.getLeft();
				n2.setLeft(lt);
				return n1;
			}
		}

		if(val<root.getValue()){
			k=delete(root.getLeft(),val);
			root.setLeft(k);
		}
		else{
			k=delete(root.getRight(),val);
			root.setRight(k);
		}
		return root;		
	}	

	/*method to count number of nodes of BST*/
	public int countNodes(){
		return countNodes(root);
	}	

	private int countNodes(TreeNode node){
		if(node==null)
			return 0;
		else{
			int count=1;
			count+=countNodes(node.getLeft());
			count+=countNodes(node.getRight());
			return count;
		}
	}	

	/*method to search element of BST*/
	public boolean search(int val){
		return search(root,val);
	}	

	private boolean search(TreeNode node,int val){
		boolean found=false;
		while(node!=null && !found){
			if(val<node.getValue())
				node=node.getLeft();
			else if (val>node.getValue())
				node=node.getRight();
			else{
				found=true;
				break;
			}
			found=search(node,val);		
		}
		return found;
	}
	
	/*method for inorder traversal*/
	public void inOrder(){
		inOrder(root);
	}
	
	private void inOrder(TreeNode node){
		if(node != null){
			inOrder(node.getLeft());
			System.out.print(node.getValue() +" ");
			inOrder(node.getRight());
		}
	}
	
	/*method for preorder traversal*/
	public void preOrder(){
		preOrder(root);
	}
	
	private void preOrder(TreeNode node){
		if(node != null){
			System.out.print(node.getValue() +" ");
			inOrder(node.getLeft());			
			inOrder(node.getRight());
		}
	}
	
	/*method for postorder traversal*/
	public void postOrder(){
		postOrder(root);
	}
	
	private void postOrder(TreeNode node){
		if(node != null){			
			inOrder(node.getLeft());			
			inOrder(node.getRight());
			System.out.print(node.getValue() +" ");
		}
	}
	
}
