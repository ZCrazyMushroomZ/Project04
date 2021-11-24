package Project04;

public class TreeNode<T> {
	public T element;
	public TreeNode<T> left;
	public TreeNode<T> right;
	
	public TreeNode() {
		this(null, null, null);
	}
	public TreeNode(T element) {
		this(element, null, null);
	}
	public TreeNode(T element, TreeNode<T> left, TreeNode<T> right) {
		this.element = element;
		this.left = left;
		this.right = left;
	}
	public T getElement() {
		return element;
		
	}
	public void setElement(T element) {
		this.element = element;
	}
	public TreeNode<T> getRight(){
		return right;
	}
	public void setRight(TreeNode<T> right){
		this.right = right;
	}
	public TreeNode<T> getLeft(){
		return left;
	}
	public void setLeft(TreeNode<T> left){
		this.left = left;
	}

}
