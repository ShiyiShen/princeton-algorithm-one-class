public clas PermutationString {
	public static void main(Strings []){
		String str1 = "dog";
		String str2 = "god";

		if(str1.length() != str2.length()){
			return false;
		}

		int size = str1.length();

		char[] charArray1 = new char[size];
		char[] charArray2 = new char[size];

		//put string into char array
		charArray1 = toCharArray(str1);
		charArray2 = toCharArray(str2);

		//sort char array
		char[] newcharArray1 = sortCharArray(charArray1);
		char[] newcharArray2 = sortCharArray(charArray2);
		
		for(int i; i<size;i++){
			if(newcharArray1[i] != newcharArray2[i]){
				return false;
			}
		}


		/* ========= Another implementation ============== */
		/* compare the number of each char in both strings */

		int[] counts = new int[256];

		for(char c : charArray1){
			counts[c]++;
		}
		for(char c : charArray2){
			counts[c]--; 
			if(counts[c] < 0) return false;
		}
		return true;

	}
}