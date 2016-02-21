public class SortZeroOne{

	public Node sort(Node head) {
		/*  assume 1 first, then 0 */
		/* Go through the list */
		/* if 0 found, point to next element that’s 1 */
		/* add the 0 to then head of 0 list */
		/* when reach the end the list, point the tail to the first 0 found */
		
		if(head == null)
			return null;

		Node current = head;
		Node zero_head = null;

		while (current != null){
			/* start with the second element */
			if(current.next !=null && current.next.data == 0){
				current.next.next = zero_head;
				zero_head = current.next;
				current.next = current.next.next;
			}
			current = current.next;
		}

		/* take care of 1st item in the list, head may need to change */
		if(head.data == 0){
			head.next = zero_head;
			zero_head = head;
			head = head.next;
		}

		/* connect the two list */
		current.next = zero_head;

		return head; 
	}

	public Node sortSwap(Node head){
		/* initialize the values */
		Node p = findNext(head,1);
		Node q = findNext(head,0);

		while(p != null && q != null){
			
			/* 'swap' value */
			p.data = 0;
			q.data = 1;

			p = findNext(p,1);
			q = findNext(q,0);
		}
	}

	private Node findNext (Node node, int data){
		while(node != null && tmp.data != data){
			node = node.next;
		}
		return node;
	}

}


