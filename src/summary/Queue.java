/* check is two queue are the same */
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


/* implement a queue with two stacks */
public class QueueTwoStack<Integer> {

	private Stack<Integer> stack1 = new Stack<Integer>();
	private Stack<Integer> stack2 = new Stack<Integer>();

	QueueTwoStack () {
		stack1 = new Stack<Integer>();
		stack2 = new Stack<Integer>();
	}

	public int size (){
		if(!stack1.isEmpty())
			return stack1.size();
		if(!stack2.isEmpty())
			return stack2.size();
		return 0;
	}

	//return element from head
	public int pop(){
		while(!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
		return stack2.pop();
	}

	//push to tail
	public void push () {
		//put all element back to stack 1, then push new element to stack 1
		while(!stack2.isEmpty()){
			stack1.push(stack2.pop());
		}
		//always push into stack1
		stack1.push();
	}

	public int peek() {
		while(!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
		return stack2.peek();
	}
	
}