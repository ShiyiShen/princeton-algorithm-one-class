public class InsertBinaryTree {

	public Node head;

	private class Node {
		private int data;
		private Node left; 
		private Node right;
	}

	public void insert(int data){
		head = insert(head, data);
	}

	private Node insert(Node node, int data){
		Node tmp = head;

		if(tmp.getData() == null){
			tmp = new Node(data); 
		}else{

			if(data < tmp.getData()){
				tmp.setLeft(insert(tmp.getLeft(), data));
			}else{
				tmp.setRight(insert(tmp.getRight(), data));
			}
		}
		return node;
	}

}