package Project04;

public class Helper {
	
	
	static void creat() throws TreeException {
		BinarySearchTree<Integer> tree1 = new BinarySearchTree<Integer>();
		BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
//		tree1.root.setElement(20);
//		tree1.attachLeft(10);
//		tree1.attachRight(30);
		
		tree.insert(20);
		tree.insert(10);
		tree.insert(30);
		tree.insert(50);
		tree.insert(60);
		tree.insert(5);
		
		
		TreeIterator iterator = new TreeIterator(tree);
		iterator.setInorder();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
	}
}
