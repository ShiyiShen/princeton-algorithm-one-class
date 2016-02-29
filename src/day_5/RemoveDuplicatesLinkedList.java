/*

	LinkedListNode
		Node.data
		Node.next

*/

public void removeDuplicatsLinkedList (Node head){
	/* can use hashset instead:  
		HashSet<Integer> set = new HashSet<Integer>();
		if(set.contains(x)){...}
		set.add(x)
	 */
	Hashtable<Integer, boolean> hash = new Hashtable<Integer, boolean>();
	Node node = head;
	if(head != null)
		hash.add(head.data, true);

	while(node != null) {
		if(hash.containsKey(node.next.data)){
			node.next = node.next.next;
		} else {
			hash.add(node.next.data, true);
		}
		node = node.next;
	}
}