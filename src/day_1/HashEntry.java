public class HashEntry{
	
	private int key;
	private String value;

	HashEntry(int k, String v){
		this.key = k;
		this.value = v;
	}

	public String getValue(){
		return this.value;
	}

	public int getKey(){
		return this.key;
	}
 
}