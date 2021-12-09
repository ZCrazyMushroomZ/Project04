package Project04;
/**
 * Represents BinarySearchTree.
 * @author Yulong Chen
 * @version 1.0
 */
public class BinarySearchTree<T extends Comparable<T>> {
	public TreeNode<T> root;
	/**
	 * Constructor with no element
	 */
	public BinarySearchTree() {
		this.root = null;
	}
	/**
	 * Constructor with one specific element. Create a new tree
	 * @param rootItem The reference of the tree
	 */
	public BinarySearchTree(T rootItem) {
		this.root = new TreeNode<T>(rootItem, null, null);
	}
	/**
	 * Determine whether the tree is empty
	 * @return true: the tree is empty, false: not empty
	 */
	public boolean isEmpty() {
		return this.root == null;
	}
	/**
	 * Delete all nodes of the tree
	 */
	public void makeEmpty() {
		this.root = null;
	}

	  /**
	   * Returns the element in the tree's root
	   * @return A reference to the item of the root
	   * @throws TreeException if the tree is empty
	   */
	public T getRoot() throws TreeException {
		if(this.root == null) {
			throw new TreeException("The root is null");
		}else {
			return this.root.getElement();
		}
	}
	/**
	 * Create a new root
	 * @param newItem The reference of the root
	 */
	public void setRoot(T newItem){//if not null, replace the item; if null, create a root
		if (!isEmpty()) {
		       this.root.setElement(newItem);
		    }else {
		       this.root = new TreeNode<T>(newItem, null, null);
		    }
	}
	/**
	 * Insert a new node
	 * @param element The node that inserted
	 */
	public void insert(T element) {
		root = Insert(root, element);
	}
    /**
     * Search a specific node from the tree
     * @param element The node that searched
     */
	public void search(T element) {
		root = Search(root, element);
	}
	
	/**
	 * Delete a specific node from the tree
	 * @param element The node that deleted
	 * @throws TreeException
	 */
	public void delete(T element) throws TreeException {
		//return this.Search(root, element);
		root = Delete(root, element);
	}
	/**
	 * Insert a new root
	 * @param root The root of tree
	 * @param element Inserted node
	 * @return The reference of node of inserted
	 */
	private TreeNode<T> Insert(TreeNode<T> root, T element) {
		if(root == null) {//if the tree is null
			//create a new tree
			root = new TreeNode<T>(element, null, null);
			return root;
		}
		T curElement = root.getElement();
		if(curElement.compareTo(element) > 0) {//if current name < inserted name
			//root change to the left of root
			root.left = Insert(root.getLeft(), element);
			return root;
		}
		else {//current name > inserted name
			//root change to the right of root
			root.right = Insert(root.getRight(), element);
			return root;
		}
	}
	/**
	 * Search a specific node
	 * @param root The root node of the tree
	 * @param element The searched node
	 * @return The reference of searched node
	 */
	private TreeNode<T> Search(TreeNode<T> root, T element) {
		TreeNode<T> current = root;
		if(root != null) {
			if(root.getElement().compareTo(element) == 0) {//if the element of root = searched element
				//current element = root element
				current.setElement(root.getElement());
			}else if(root.getElement().compareTo(element) < 0) {//if the element of root < searched element
				current = Search(root.getRight(), element);
			}else {//if the element of root > searched element
				current = Search(root.getLeft(), element);
			}
		}
		return current;
	}
	
	/**
	 * Delete a specific node
	 * @param root The root of the tree
	 * @param element The specific node
	 * @return The reference of deleted node
	 * @throws TreeException
	 */
	private TreeNode<T> Delete(TreeNode<T> root, T element) throws TreeException {
	     if(root == null) {//tree is null
			 throw new TreeException("Value doesn't exist!");
		 }else if(root.getElement().compareTo(element) > 0) {//if the element of node > searched element
			 root.left = Delete(root.getLeft(), element); 	
		 }else if (root.getElement().compareTo(element) < 0) {//if the element of node < searched element
			 root.right = Delete(root.getRight(), element);
	        }else {//if the element of node = searched element
	        	if(root.getLeft() == null) {//only right branch
	        		return root.getRight();
	        	}else if(root.getRight() == null) {//only left branch
	        		return root.getLeft();
	        	}else {
	        		//get the left child of deleted node, then find the biggest element
	        		TreeNode<T> maxChild = removeMax(root.getLeft());
	        		//switch the maxChild and root
	        		T temp = root.getElement();
	        		root.setElement(maxChild.getElement());
	        		maxChild.setElement(temp);
	        		//link the left of root 
	        		root.left = Delete(root.getLeft(), maxChild.getElement());
	        	} 		
	        }
		 return root;
	 }
	
    /**
     * Return the most right node
     * @param node The root node of deleted node
     * @return The most right node
     */
	private TreeNode<T> removeMax(TreeNode<T> node) {
		while(true) {
			if(node.getRight() == null) {//if the right child of node = 0
				return node;
			}else {//if the right child of node not equal to 0
				node = node.getRight();
			}
		}
	}
}

