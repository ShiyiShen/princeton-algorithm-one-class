package week_2;

public class ResizingArrayQueueOfStrings {
	
	private String[] s = new String[1];
	private int last = 0;
	private int first = 0;
	
//	public ResizingArrayStackOfStrings(int capacity)
//	{
//		s = new String[capacity];
//	}
	
	public void inQueue(String item){
		//grow twice of the current length
		if(last == s.length){
			resize(2*s.length);
		}
		//we do allow inserting null into an element
		s[last++] = item;
 	}
	
	public void resize(int capacity){
		String[] copy = new String[capacity];
		int i;
		for(i=first;i<=last;i++){
			copy[i]=s[i];
		}
		first = 0;
		last = i;
		s = copy;
	}
	
	public String deQueue(){		
		String item = s[first];
		s[first] = null;
		first++;
		//set the pop element to be null		
		//when the array is one quarter full, shrine the size to half
		if(first >0 && size() == s.length/4)resize(s.length/2);			
		return item;
	}
	
	public int size(){
		return last-first+1;
	}
	
	public boolean isEmpty(){
		return size() == 0;
	}
	
	public String toString(){
		String rVal = "";
		for(int i=first;i<=last;i++){
			rVal = rVal + s[i];
		}		
		return rVal;
	}
	
	public static void main(String[] args){
		
	}
}
