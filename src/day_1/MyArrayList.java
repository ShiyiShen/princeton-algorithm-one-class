public class MyArrayList {

	private int size = 2;
	private String[] arraylist;
	private int pointer;

	public MyArrayList(){
		pointer = 0;
		arraylist = new String[size];
	}

	public void add(String s){
		if(pointer >= size){
			increaseSize();
		}
		arraylist[pointer] = s;
		pointer++;
		System.out.println("Added new item: " + s);
	}

	public String get(int key){
		if(key < size)
			return arraylist[key];
		else
			return null;
	}

	public void increaseSize(){
		//double the size
		int newSize = size * 2;
		System.out.println("========================");
		System.out.println("original size: " + size);
		System.out.println("New size: " + newSize);
		System.out.println("========================");

		//make a new array, doubling the size
		String[] s = new String[newSize];
		//copy everything from the original array to the new array
		for(int i=0; i<size; i++){
			s[i] = arraylist[i];
		}
		arraylist = s;
		size = newSize;
	}

	public void delete(String s){
		for(int i=0; i<size;i++){
			//if the element is found
			if(arraylist[i] != null && arraylist[i].equals(s)){
				moveRestofArrayUp(i);
			}
		}
	}

	public void moveRestofArrayUp(int pointer){
		System.out.println("========================");
		System.out.println("Delete ele at: " + pointer);
		while(pointer+1 < size && arraylist[pointer+1] != null){
			arraylist[pointer] = arraylist[pointer+1];
			pointer++;
		}
		arraylist[pointer] = null;	
	}

	public void printList(){
		for(int i=0; i<size;i++){
			System.out.println(i + " - " + arraylist[i]);
		}
	}

	public static void main (String[] args){
		
		MyArrayList mylist = new MyArrayList();
		mylist.add("abcd");
		mylist.add("efgh");
		mylist.add("hijk");
		mylist.add("lnm");
		
		
		System.out.println("========================");
		System.out.println("Original array: ");
		mylist.printList();
		
		mylist.delete("efgh");
		System.out.println("========================");
		System.out.println("New array: ");
		mylist.printList();
	}


}