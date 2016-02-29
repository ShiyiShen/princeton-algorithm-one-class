/* sort a stack in ascending order with one additional stack */
public Stack<Integer> sortStack (Stack<Integer> stack) {

	Stack<Integer> stack2 = new Stack<Integer>();
	int tmp = 0;

	while (!stack.isEmpty()) {
		int tmp = stack.pop();
		while(!stack2.isEmpty() && tmp < stack2.peek()){
			stack.push(stack2.pop());
		} 	
		stack2.push(tmp);
	}

	return stack2;
}

/* sort a stack in ascending order using mergesort */
public Stack<Integer> sortStack (Stack<Integer> stack) {


}