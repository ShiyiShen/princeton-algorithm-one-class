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


	// public int[] arr;
	// public int tail = 0;
	// public int[] mins;

	// public int pop(){
	// 	return arr[tail--];
	// }

	// public void push(int x){
	// 	if(tail == 0){
	// 		arr[0] = x;
	// 		mins[0] = x;
	// 		return ;
	// 	}

	// 	int current_min = mins[min_tail];
	// 	tail++;
	// 	if(x < current_min){
	// 		mins[tail] = x;
	// 	}else{
	// 		mins[tail] = current_min;
	// 	}
	// 	arr[tail] = x;
	// 	return ;
	// }

	// public int getCurentMin(){
	// 	return mins[tail];
	// }
}