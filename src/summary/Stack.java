/* remove even number from a stack */
public Stack<Integer> removeEvenNumber (Stack<Integer> s){
	Stack tmp = new Stack();
	while (!s.isEmpty()){
		int i = s.pop();
		if(i % 2 != 0)
			tmp.push(i);
	}

	while(!tmp.isEmpty){
		s.push(tmp.pop());
	}

	return s;
}

/* reverse a stack */
public Stack<Integer> reserveStack (Stack<Integer> s){
	Stack reversed = new Stack();
	while (!s.isEmpty()){
		reversed.push(s.pop());
	}
	return reversed;
}


/* trun one arr into three stacks */
public class Stack {

	public int[] arr;
	private int[] stackPointer;


	Stack (int[] arr) {
		stackPointer = mew int[3]();
		stackPointer[0] = getHead(arr, 0);
		stackPointer[1] = getHead(arr, 1);
		stackPointer[2] = getHead(arr, 2); 
	}

	public int push(int which){
		int stack_max = getStackMaxPosition();
		int pointer = stackPointer[which];
		if(pointer < stack_max){
			arr[pointer] = i;
			stackPointer[which]++;
		}
	}

	public int pop(int which){
		int pointer = stackPointer[which];
		if(!isEmpty(which)){
			arr[--pointer] = -1;
			stackPointer[which]--;
		}	
	}

	private int getHead (int which){
		return arr.length * (which - 1) / 3;
	}

	private int getStackMaxPosition (int which) {
		return arr.length * which / 3 - 1;
	}

	private boolean isEmpty (int which) {
		return stackPointer[which] == -1;
	}
}


/* store min for each element in a stack */
public class StackwithMin extends Stack<Integer> {
	
	public Stack<Integer> = s2;

	StackwithMin () {
		s2 = new Stack<Integer>();
	}

	public void push (int value) {
		if(value <= min())
			s2.push(value);
		super.push(value);
	}

	public Integer pop(){
		int value = super.pop();
		if(value == min()){
			s2.pop();
		}
		return value;
	}

	public int min(){
		if(s2.isEmpty()){
			return Integer.MAX_VALUE;
		} else {
			//The method call returns the object at the top of this stack.
			return s2.peek();
		}
	}
}


/* implement set of stacks, acting link one stack */
public class SetOfStacks {

	public ArrayList<Stack> stacks;
	public int capacity;
	public int tail = 0;

	SetOfStacks (int c) {
		stacks = new ArrayList<Stack>();
		capacity = c;
	}

	public void push (int x) {
		Stack last = getLastStack();
		if(last != null && !last.isFull()){
			last.push(x);
		}else {
			Stack<Integer> stack = new Stack<Integer>();
			stack.push(x);
			stacks.add(stack);
		}
	}

	public int pop () {
		Stack last = getLastStack();
		if(last.size()==0){
			last = stacks.remove(stacks.size()-1);
		}
		return last.pop();
	}

	private Stack getLastStack(){
		return stacks.tail();
	}
}

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
