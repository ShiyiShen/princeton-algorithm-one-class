/* Assume sorted asc*/
public node insertInOrder(int data){
	/* create a new node */
	Node n = new Node(data);

	/* the linked list is empty, insert at the beginning */  
	//******
	if(head == null || data < head.data){
		n.next = head;
		return n;	
	}

	/* start from the head */
	Node current = head;
	/* find the spot to insert */
	while(current != null && data > current.next.data){	
		current = current.next;	
	}

	/* insert the ndoe */
	//********
	current.next = n;
	n.current = current.next.next;

	return head;
} 