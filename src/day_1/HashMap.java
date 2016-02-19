public class HashMap {

	private final static int TABLE_SIZE = 5;

	HashEntry[] table;

	HashMap(){
		table = new HashEntry[TABLE_SIZE];
		for (int i=0; i<TABLE_SIZE; i++){
			table[i] = null;
		}
	}

	public String get(int key){
		int hash = key % TABLE_SIZE;

		System.out.println("get: Oringal Hash value of " + key + " is: " + hash);
		if(table[hash] != null && table[hash].getKey() != key){
			hash = (hash + 1) % TABLE_SIZE;
		}
		System.out.println("get: Hash value of " + key + " is: " + hash);
		
		if(table[hash] == null)
			return null;
		else
			return table[hash].getValue();
	}

	public void put(int key, String value){
		int hash = (key % TABLE_SIZE);
		System.out.println("get: Original Hash value of " + key + " is: " + hash);

		if(table[hash] != null && table[hash].getKey() != key){
			hash = (hash + 1) % TABLE_SIZE;
		}
		System.out.println("put: Hash value of " + key + " is: " + hash);

		table[hash] = new HashEntry(hash, value);
	}


	public static void main (String[] args){
		HashMap hashMap = new HashMap();
		hashMap.put(23, "wedsfs");
		hashMap.put(456, "wer");
		hashMap.put(19, "wvtrty");
		hashMap.put(92, "srnny");
		hashMap.put(58, "ccbhjk");
		System.out.println("==========================================");
		System.out.println("The value of 23 is: " + hashMap.get(23));
		System.out.println("==========================================");
		System.out.println("The value of 367 is: " + hashMap.get(367));

	}

}