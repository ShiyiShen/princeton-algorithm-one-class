/* Binary Search Tree */
public class BinarySearchTree {
	
	private TreeEntry head;

	BinarySearchTree (){
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

	/* insert binary tree */
	private TreeEntry insert(TreeEntry node, int data){
		if(node == null){
			node = new TreeEntry(data);
			System.out.println("Insert: " + data);
		}else{
			//if value is greater than node value
			if(data > node.getData()){
				node.setRight(insert(node.getRight(), data));
			}else{
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

	/*  Function to search for an element recursively */
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
}

/* sum binary tree */
public class SumBinaryTree {
	private Node head;
	public int sum(){
		return sum(head);
	}

	private int sum(Node node){
		int total = 0 ;
		Node tmp = head;

		if(tmp == null)
			return 0;	

		total += tmp.data;
		if(tmp.left != null)
			total += sum(tmp.left);

		if(tmp.right != null)
			total += sum(tmp.right);
			
		return total;
	}

}


/* binarySearch: recursive solution */
public int binarySearch(int[] arr, int s){
	return binarySearch(arr, s, 0, arr.length-1, s);
}

/* return the position of the integer found */
/* not found, return -1 */
private int binarySearch(int[] arr, int s, int left, int right){	
	
	if(left > right) 
		return -1;
	
	int middle = (left + right ) /2;
	
	if(s == arr[middle]) 
		return middle;
	else if (s < arr[middle])
		return binarySearch(arr, left, middle - 1, s);
	else if 
		return binarySearch(arr, middle + 1, right, s);
}

/* binarySearch : iterative solution */
public int binarySearch2(int[] arr, int x){
	int left = 0;
	int right = arr.length-1;

	while(left <= right){
		int middle = (left + right ) /2;

		if(arr[middle] == x)
			return middle;
		else if(x < arr[middle]){
			right =  middle - 1;
		}else {
			left = middle + 1;
		}
	}

	return -1;
}


/* implement depth first search to find x */
public boolean depthFirstSearch(Node node, int x){
	if(node == null)
		return false;

	if(node.data == x)
		return true;

	return depthFirstSearch(node.left, x) || 
		   depthFirstSearch(ndoe.right, x);
}

import java.lang.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/* check if a tree is balanced binary tree */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(getHeight(root, 0) == -1){
            return false;
        }
        return true;
    }
    
    private int getHeight(TreeNode node, int i){
        
        if(node == null)
            return 0;
            
        int left = getHeight(node.left, i);
        int right = getHeight(node.right, i);
        
        if(Math.abs(left-right) > 1 || left == -1 || right == -1)
            return -1;
        
        //get max as tree height
        return Math.max(left, right) + 1;
    }
}


/* return each level of node in the BT as a linked list */
public void BTLinkedList (Node root) {
	/* return array list of head of all linkedlist */
	ArrayList<LinkedList<Node>> lists = new ArrayList<LinkedList<Node>>();
	createLevelLinkedList(lists, root, 0);
	return lists;
}

private void createLevelLinkedList (ArrayList<LinkedList<Node>> lists, Node root, int level) {
	
	if(root == null)
		return null;

	LinkedList<Node> list = new LinkedList<Node>();
	if(lists.size == level){
		list = new LinkedList();
	}else{
		list = lists.get(level);
	}

	list.add(root);
	createLevelLinkedList(root.left, lists, level + 1);
	createLevelLinkedList(root.right, lists, level + 1);
}

/* Create a minimal BST from a sorted array */
public void createMinimalBST (int[] arr) {
	createMinimalBST(arr, 0, arr.length - 1);
}
private node createMinimalBST (int[] arr, int start, int end) {
	if(start > end)
		return null;	

	int middle = (end + start) / 2;

	Node node = new Node(arr[middle]);
	node.left = createMinimalBST(arr, start, middle - 1);
	ndoe.right = createMinimalBST(arr, middle + 1, end);

	return node;
}


/* check if it's BST */
public boolean isBST (TreeNode root) {
	return isBST(root, null, null);
}
private boolean isBST(TreeNode node, Integer min, Integer max){

	if(node == null)
		return true;


	if((min != null && node.data < min) ||
	   (max != null && node.data > max))
		return false; 

	if(!isBST(node.left, min, node.data)) ||
	   !isBST(node.right, node.data, max)) {
		return false;
	} 

	return true;
}