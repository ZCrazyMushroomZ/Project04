package Project04;
import java.util.LinkedList;
public class TreeIterator<T> {
	private BinarySearchTree<T> tree;
	private LinkedList<TreeNode<T>> list;
	
	 public TreeIterator(BinarySearchTree<T> tree) {
		  this.tree = tree;
		  this.list = new LinkedList<TreeNode<T>>();
	  }
	 
	 public boolean hasNext() {
		 return !this.list.isEmpty();
	 }
	 
	 public T next() {//Return the next element in the iteration
		 return this.list.remove().getElement();
	 }
	 /**
	   * Sets the traversal type to be preorder.
	   */
	  public void setPreorder() {
		  this.list.clear();
	      this.preorder(this.tree.root);
	  }

	/**
	   * Sets the traversal type to be inorder.
	   */
	  public void setInorder() {
		  this.list.clear();
	      this.inorder(this.tree.root);
	  }

	  /**
	   * Sets the traversal type to be postorder.
	   */
	  public void setPostorder() {
		  this.list.clear();
	      this.postorder(this.tree.root);
	  }
	  
	  private void preorder(TreeNode<T> treeNode) {
		    if(treeNode != null){
		    	this.list.add(treeNode);
		    	preorder(treeNode.getLeft());
		    	preorder(treeNode.getRight());
		    	
		    }
	  }
	  private void inorder(TreeNode<T> treeNode) {
		  if(treeNode != null){
		    	inorder(treeNode.getLeft());
		    	this.list.add(treeNode);
		    	inorder(treeNode.getRight());	
		    }
	  }
	  
	  private void postorder(TreeNode<T> treeNode) {
		  if(treeNode != null){
			    postorder(treeNode.getLeft());
		    	postorder(treeNode.getRight());
		    	this.list.add(treeNode);
		    }
	  }
		  
	   
	

}
