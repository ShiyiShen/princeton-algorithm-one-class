package week_2;

public class FixedCapacityStackOfStrings {

	private String[] s;
	private int N = 0;
	
	public FixedCapacityStackOfStrings(int capacity)
	{
		s = new String[capacity];
	}
	
	public void push(String item){
		//we do allow inserting null into an element
		s[N++] = item;
 	}
	
	public String pop(){
		String item = s[--N];
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
	
	public static void main(String[] args){
		
	}
	
}
