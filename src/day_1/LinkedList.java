public class LinkedList<String> {
	
	private Node head;
	private Node tail;


	private class Node {
		Node next = null;
		String value;
	}

	
	public void add(String st){
		
		Node n = new Node();
		n.value = st;
		
		if(head == null) {	
			//when there's only one element
			head = n;
			tail = n;
			System.out.println("1 - adding value to the header: " + st);
		}else{
			Node tmp = head;
			while(tmp.next != null){
				tmp = tmp.next;
			}
			tmp.next = n;
			tail = n;
			System.out.println("2 - adding value to the tail: " + st);
		}
	}


	public boolean isEmpty(){
		if(head == null) return true;
		return false;
	}


	public boolean find (String st){
		Node n = new Node();
		if (head == null){
			System.out.println("find - 1");
			return false;
		}else if(head.value.equals(st)){
			System.out.println("find - 2");
			return true;
		}else{
			n = head;
			while(n.next != null){
				System.out.println("find - 2");
				if(n.equals(st)){
					return true;
				}
				n = n.next;
			}
		}
		return false;
	}

	public boolean delete (String st) {

		Node tmp = new Node();
		tmp = head;

		if (head == null){
			System.out.println("delete - 1");
			return false;
		}else if(head.value.equals(st)){
			System.out.println("delete - 2");
			head = head.next;
			return true;
		}else{
			while (tmp.next != null){
				if(tmp.next.value.equals(st)){
					//set prev node point to the next node
					System.out.println("delete - 3");
					tmp.next = tmp.next.next;
					return true; 
				}
				tmp = tmp.next;
			}
		}
		System.out.println("4");
		return false;
	}

	public void printString(){
		//String rVal  = "";
		Node node = new Node();
		node = head;		
		while(node.next != null){			
			System.out.println(node.value);
			//rVal = rVal + node.value + " ";
			node = node.next;
		}
		//print out the very last item
		if(node != null){
			//rVal = rVal + node.value;
			System.out.println(node.value);
		}		
		
	}


	public void removeDuplicate(){
		Node tmp = new Node();
		Node pointer = new Node();
		
		//Only where the list has more than 1 items
		if(head != null && head.next != null){
			
			//set two pointers
			//One starting from the head, loop through the list
			pointer = head; 
			//Second starting from the head.next
			tmp = head.next;

			while(pointer.next != null){

				System.out.println("outer round: ");
				printString();
				//compare pointer to the rest of the list			
				while(tmp.next != null){
					System.out.println("inner round: ");
					printString();
					//if duplicate is found, remove it
					if(tmp.next.value.equals(pointer.value)){
						tmp.next = tmp.next.next;
					}
					tmp = tmp.next;
				}
				//move pointer 1 to the next item
				pointer = pointer.next;
				//move point 2 to the iterm after the point 1
				if(pointer.next != null){
					tmp = pointer.next;
				}			
			}
		}
	}

	public void removeDuplicate2(){
		
		Node tmp = new Node();
		tmp = head;
		//loop through the list, add item to the new linkedlist
		if(head != null && head.next != null){
			while(tmp.next != null) {
				String 
			}
		}
		


		return l;
	}


	public static void main (String[] args){
		// System.out.println("start");
		// LinkedList<String> ll = new LinkedList<String>();
		// ll.delete("890");
		// ll.add("ert");
		// System.out.println("Is 'ert' exist? " +ll.find("ert"));
		// ll.add("kis");
		// ll.add("ioq");
		// ll.delete("kis");
		// ll.delete("ert");
		// ll.add("yuy");
		// ll.printString();
		// System.out.println("Is 'ert' exist? " +ll.find("ert"));
		// System.out.println("end");


		System.out.println("start");
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("ert");
		ll.add("kis");
		ll.add("ioq");
		ll.add("yuy");
		ll.add("kis");
		System.out.println("Original String: ");
		ll.printString();
		System.out.println("In process ");
		ll.removeDuplicate();
		System.out.println("Final String: ");
		ll.printString();
		System.out.println("end");

	}

}
