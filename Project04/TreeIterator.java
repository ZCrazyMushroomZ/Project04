package Project04;
import java.util.LinkedList;
public class TreeIterator<T> {
	private BinarySearchTree tree;
	private LinkedList<TreeNode<T>> list;
	/**
	 * Create a constructor
	 * @param tree The type of BinarySearchTree
	 */
	 public TreeIterator(BinarySearchTree tree){
		  this.tree = tree;
		  this.list = new LinkedList<TreeNode<T>>();
	  }
	 /**
	  * Determines whether there are any more elements
	  * @return True: have element. False: null
	  */
	 public boolean hasNext() {
		 return !this.list.isEmpty();
	 }
	 /**
	  * Return the next element in the iteration
	  * @return The next element in the iteration
	  */
	 public T next() {
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
	  /**
	   * Sets the traversal type to be preorder.
	   * @param treeNode The node in the tree
	   */
	  private void preorder(TreeNode<T> treeNode) {
		    if(treeNode != null){
		    	this.list.add(treeNode);
		    	preorder(treeNode.getLeft());
		    	preorder(treeNode.getRight());
		    	
		    }
	  }
	  /**
	   * Sets the traversal type to be inorder.
	   * @param treeNode The node in the tree
	   */
	  private void inorder(TreeNode<T> treeNode) {
		  if(treeNode != null){
		    	inorder(treeNode.getLeft());
		    	this.list.add(treeNode);
		    	inorder(treeNode.getRight());	
		    }
	  }
	  /**
	   * Sets the traversal type to be postorder.
	   * @param treeNode The node in the tree
	   */
	  private void postorder(TreeNode<T> treeNode) {
		  if(treeNode != null){
			    postorder(treeNode.getLeft());
		    	postorder(treeNode.getRight());
		    	this.list.add(treeNode);
		    }
	  }
		  
	   
	

}
