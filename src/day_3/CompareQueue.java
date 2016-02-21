public Queue<Integer> compare (Queue<Integer> q, Queue<Integer> p){
	while (!q.isEmpty() && !p.isEmpty()) {
		int a = p.pop();
		int b = q.pop();
		if(a != b)
		return false;
	}
	if (!q.isEmpty() || !p.isEmpty())
		return false;

	return true;
}