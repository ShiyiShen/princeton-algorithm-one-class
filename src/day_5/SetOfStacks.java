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