public Stack<Integer> reserveStack (Stack<Integer> s){
	Stack reversed = new Stack();
	while (!s.isEmpty()){
		reversed.push(s.pop());
	}
	return reversed;
}