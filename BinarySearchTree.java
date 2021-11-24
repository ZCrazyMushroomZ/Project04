package Project04;

public class BinarySearchTree<T> {
	public TreeNode<T> root;
	
	public BinarySearchTree() {
		this(null);
	}
	public BinarySearchTree(T rootItem) {
		this.root = new TreeNode<T>(rootItem, null, null);
	}
	
	public boolean isEmpty() {
		return this.root == null;
	}
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
			throw new TreeException("fdsa");
		}else {
			return this.root.getElement();
		}
	}
	public void setRoot(T newItem){//如果不为空，replace the item; if null,create a root
		if (!isEmpty()) {
		       this.root.setElement(newItem);
		    }else {
		       this.root = new TreeNode<T>(newItem, null, null);
		    }
	}
	public void attachLeft(T newItem) throws TreeException {
		if(isEmpty()) {
			throw new TreeException("The tree is empty that cannot be attached.");
		}else if(this.root.getLeft() != null) {
			throw new TreeException("The left child of this root has existed.");
		}else {
			this.root.setLeft(new TreeNode<T>(newItem, null, null));
		}
	}
	
	public void attachRight(T newItem) throws TreeException {
		if(isEmpty()) {
			throw new TreeException("The tree is empty that cannot be attached.");
		}else if(this.root.getRight() != null) {
			throw new TreeException("The right child of this root has existed.");
		}else {
			this.root.setRight(new TreeNode<T>(newItem, null, null));
		}
	}
	public void attachLeftSubtree(BinarySearchTree<T> leftTree) throws TreeException {
		if(isEmpty()) {
			throw new TreeException("The tree is empty that subtree cannot be attached");
		}else if(this.root.getLeft() != null) {
			throw new TreeException("The left child of this root has existed.");
		}else {
			this.root.setLeft(leftTree.root);
			leftTree.makeEmpty();
		}
	}
	public void attachRightSubtree(BinarySearchTree<T> rightTree) throws TreeException {
		if(isEmpty()) {
			throw new TreeException("The tree is empty that subtree cannot be attached");
		}else if(this.root.getLeft() != null) {
			throw new TreeException("The right child of this root has existed.");
		}else {
			this.root.setLeft(rightTree.root);
			rightTree.makeEmpty();
		}
	}
	
	public void iterator(){
		
	}
	
	public void insert(int key) {
		root = insert1(root, key);
	}
	
	public TreeNode insert1(TreeNode root, int key) {
		TreeNode newNode = new TreeNode(key);
		if(root.element == null) {
			root = new TreeNode(key);
			return root;
		}
		TreeNode current = root;
		while(true) {
			if(key < Integer.parseInt(current.element.toString())) {
				if(current.left == null) {
				current.left = newNode;
				break;
			}else {
				current = current.left;
			}
		}else if(key > Integer.parseInt(current.element.toString())) {
			if(current.right == null) {
			current.right = newNode;
			break;
		}else {
			current = current.right;
		}
	  }
	}
 	return root;	
	}
	
	

	public void search(int key) {
		
	}
	
	
	

}
