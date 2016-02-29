public LinkedListNode partitionLinkedList (LinkedListNode head, int a) {
	
	LinkedListNode<Integer> small_head = new LinkedListNode<Integer>();
	LinkedListNode<Integer> big_head = new LinkedListNode<Integer>();
	LinkedListNode<Integer> small_tail = small_head;
	LinkedListNode<Integer> big_tail = big_head;
	
	LinkedListNode<Integer> tmp = head;
	while(tmp != null){
		if(tmp.next.data > a) {
			big_tail.next = tmp.next;
		}
		else if(tmp.next.data < a){
			small_tail = tmp.next;
		}
		tmp = tmp.next;
	}


}