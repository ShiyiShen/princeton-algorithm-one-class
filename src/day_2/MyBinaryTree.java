public class MyBinaryTree {
	

	private TreeEntry head;

	MyBinaryTree (){
		this.head = null;
	}

	public boolean isEmpty(){
		return head == null;
	}

	public int headValue(){
		if (head == null)
			return -1;

		return head.getData();
	}

	public void insert (int data) {
		head = insert(head, data);
	}


	private TreeEntry insert(TreeEntry node, int data){
		if(node == null){
			node = new TreeEntry(data);
			System.out.println("Insert: " + data);
		}else{
			if(node.getRight() == null){
				node.setRight(insert(node.getRight(), data));
			}else {
				node.setLeft(insert(node.getLeft(), data));
			}
		}
		return node;
	}

	/* Function to count number of nodes */
	public int countNodes(){
		return countNodes(head);
	}

	/* Function to count number of nodes recursively */
	private int countNodes(TreeEntry node){
		
		if (node != null) {
			int size = 1;
			size += countNodes(node.getLeft());
			size += countNodes(node.getRight());
			return size;
		}else {
			return 0;
		}
		
	}

	/* Function to search for an element */
	public boolean search(int s){
		return search(head, s);
	}

	/* Function to search for an element recursively*/
	public boolean search(TreeEntry node, int s){
		if(node.getData() == s)
			return true;

		if(node.getLeft()!= null)
			if(search(node.getLeft(), s))
				return true;

		if(node.getRight() != null)
			if(search(node.getRight(), s)) 
				return true;

		return false;
	}

	public void inorder(){
		inorder(head);
	}

	private void inorder(TreeEntry node){
		if(node != null){
			inorder(node.getLeft());
			System.out.print(node.getData() + " ");
			inorder(node.getRight());
		}
	}

	public void preorder(){
		preorder(head);
	}

	private void preorder(TreeEntry node){
		if(node != null){
			System.out.print(node.getData() + " ");
			preorder(node.getLeft());
			preorder(node.getRight());
		}
	}

	public void postorder(){
		postorder(head);
	}

	private void postorder(TreeEntry node){
		if(node != null){		
			postorder(node.getLeft());
			postorder(node.getRight());
			System.out.print(node.getData() + " ");
		}
	}

	public static void main (String[] args){
		
		MyBinaryTree tree = new MyBinaryTree();
		System.out.println("Is the tree empty? " + tree.isEmpty());

		tree.insert(6);
		tree.insert(24);
		tree.insert(19);
		tree.insert(94);
		tree.insert(5);
		tree.insert(1);

		System.out.println("Total number of nodes: " + tree.countNodes());
		System.out.println("Is the tree empty? " + tree.isEmpty());
		System.out.println("Head of the tree " + tree.headValue());
		System.out.println("Does element 4 exist? " + tree.search(5));
		System.out.println("Does element 7 exist? " + tree.search(7));
		
		System.out.println("=================");
		System.out.println("Print in order: ");
		tree.inorder();
		System.out.println("");


		System.out.println("=================");
		System.out.println("Print pre order: ");
		tree.preorder();
		System.out.println("");


		System.out.println("=================");
		System.out.println("Print post order: ");
		tree.postorder();
		System.out.println("");
	}

}