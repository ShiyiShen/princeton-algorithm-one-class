package week_2;

public class ResizingArrayStackOfStrings {
	
	private String[] s = new String[1];
	private int N = 0;
	
//	public ResizingArrayStackOfStrings(int capacity)
//	{
//		s = new String[capacity];
//	}
	
	public void push(String item){
		//grow twice of the current length
		if(N == s.length){
			resize(2*s.length);
		}
		//we do allow inserting null into an element
		s[N++] = item;
 	}
	
	public void resize(int capacity){
		String[] copy = new String[capacity];
		for(int i=0;i<N;i++){
			copy[i]=s[i];
		}
		s = copy;
	}
	
	public String pop(){
		String item = s[--N];
		//set the pop element to be null
		s[N] = null;
		//when the array is one quarter full, shrine the size to half
		if(N >0 && N ==s.length/4)resize(s.length/2);			
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
