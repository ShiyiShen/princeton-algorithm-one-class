
/* implement an algorithm to find the kth to last element of a single linked list */
public int getLast (LinkedListNode head, int k) {
	LinkedListNode tmp = head;
	int i = 0;
	int j = 0;
	while(tmp != null) {
		if(i >= k){
			j++;
		}
		i++;
		tmp = tmp.next;
	}
	tmp = head;
	while(tmp != null){
		if(j == 0) break;
		j--;	
		tmp = tmp.next;
	}
	return tmp.data;
}

public int nthToLast (LinkedListNode head, int k) {
	if(head == null)
		return 0;

	int i = nthToLast (head.next, int k) + 1;
	if(i == k){
		System.out.println(head.data);
		return i;
	}
}