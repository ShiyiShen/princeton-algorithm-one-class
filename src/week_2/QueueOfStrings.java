package week_2;


public class QueueOfStrings {
	private Node first = null;
	private Node last = null;
	
	private class Node{
		String item;
		Node next;
	}
	
	public void inQueue(String item){			
		Node oldlast = last;
		last.item = item;				 
		last.next = null;
		oldlast.next = last;
	}
	
	public String deQueue(){		
		String item = first.item;
		first = first.next;
		return item;
	}
	
	public boolean isEmpty(){		
		return (first == null); 
	}
	
	public int size(){
		int i = 0;
		Node node = new Node();
		node = first;
		while(node.next != null){
			node = node.next;
			i++;
		}
		if(node != null){
			i++;
		}
		return i;
	}
}
