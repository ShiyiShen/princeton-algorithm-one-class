package week_2;

public class FixedCapacityStack<Item> {
	private Item[] s;
	private int N = 0;
	
	public FixedCapacityStack(int capacity)
	{
		s = (Item[])new Object[capacity];
	}
	
	public void push(Item item){
		//we do allow inserting null into an element
		s[N++] = item;
 	}
	
	public Item pop(){
		Item item = s[--N];
		//set the pop element to be null
		s[N] = null;
		return item;
	}
	
	public int size(){
		return N;
	}
	
	public boolean isEmpty(){
		return N == 0;
	}
	
	public String toString(){
		String rVal = "";
		for(int i=0;i<N;i++){
			rVal = rVal + s[i];
		}		
		return rVal;
	}
}
