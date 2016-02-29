
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

