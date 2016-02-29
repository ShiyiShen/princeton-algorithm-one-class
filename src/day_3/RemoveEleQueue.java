/* remove an element from a queue.  */
public boolean removeElementQueue (Queue<Integer> q, int k){ 
	if(k < 0 || k >= q.size())
		return false;
	int i = 1;
	while (!q.isEmpty()) {
		int head = q.pop();
		/* not the element, push back to the head */
		if(i != k){
			q.push(head);
		i++;
	}	
	return true;
}