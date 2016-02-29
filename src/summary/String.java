/* aabcccccaaa to a2b1c5a3 */

public static int countCompression (String st) {
	int length = 0;
	char last = st.charAt(0);
	for(int i=1; i<st.length(); i++){
		if(last != st.charAt(i)){
			length = length + 2;
			last = st.charAt(i);
		}	
	}
	length = length + 2;
	return length;
}


/* check if two string is permutation  */
public boolean permutationString (char[] charArray1, char[] charArray2){
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



public ArrayList<String> permutations(String word){

	if(word.length() == 0){
		ArrayList<String> list = new ArrayList<String>();
		list.add(word);
		return list;
	}

	/* remove last char and get permutations of the remainder */
	String lastChar = word.subString(word.length()-2);
	String remainder = word.subString(0, word.length()-1);
	ArrayList<String> list = permutations(remainder);
	ArrayList<String> result = new ArrayList<String>();

	int size = remainder.length;

	for(String partial : list){
		for(int i=1; i<size; i++){
			String left = remainder.subString(0,i);
			String right = remainder.subString(i+1);
			result.add(left+lastChar+right);
		}
		result.add(lastChar+remainder);
	}
	return result;
}
