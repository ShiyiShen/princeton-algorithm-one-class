package week_2;


public class Stack<Item> {
	private Node first = null;
	
	private class Node{
		Item item;
		Node reference;
	}
	
	public void push(Item item){
		Node node = new Node();
		node.item = item;
		node.reference = first;
		first = node;		
	}
	
	public Item pop(){
		Item item = first.item;
		first = first.reference;				
		return item;
	}
	
	public boolean isEmpty(){		
		return (first == null); 
	}
	
	public int size(){
		int i = 0;
		Node node = new Node();
		node = first;
		while(node.reference != null){
			node = node.reference;
			i++;
		}
		if(node != null){
			i++;
		}
		return i;
	}
	
	public static void main(String[] args){
		
		Stack<Integer> stack = new Stack<Integer>();
//		while(!StdIn.isEmpty()){
//			String s = StdIn.readString();
//			if(s.equals("-"))StdOut.print(stack.pop());
//			else stack.push(s);
//		}	
		
		stack.push(1);
		stack.push(2);
		stack.pop();
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.pop();
		stack.push(6);

		System.out.println(stack.size());
		
	}
}
