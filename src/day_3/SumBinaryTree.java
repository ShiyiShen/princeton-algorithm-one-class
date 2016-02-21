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
