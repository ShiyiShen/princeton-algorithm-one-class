package week_2;

import stdlib.StdIn;
import stdlib.StdOut;

public class StackOfStrings {

	private Node first = null;
	
	private class Node{
		String item;
		Node reference;
	}
	
	public void push(String item){
		Node node = new Node();
		node.item = item;
		node.reference = first;
		first = node;		
	}
	
	public String pop(){
		String item = first.item;
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
	
	public String toString(){
		String rVal  = "";
		Node node = new Node();
		node = first;		
		while(node.reference != null){			
			rVal = rVal + node.item + " ";
			node = node.reference;
		}
		//print out the very last item
		if(node != null){
			rVal = rVal + node.item;
		}		
		return rVal;
	}
	
	public static void main(String[] args){
		
		StackOfStrings stack = new StackOfStrings();
//		while(!StdIn.isEmpty()){
//			String s = StdIn.readString();
//			if(s.equals("-"))StdOut.print(stack.pop());
//			else stack.push(s);
//		}	
		
		stack.push("1");
		stack.push("2");
		stack.pop();
		stack.push("3");
		stack.push("4");
		stack.push("5");
		stack.pop();
		stack.push("6");
		
		System.out.println(stack.toString());
		System.out.println(stack.size());
		
	}
	
}
