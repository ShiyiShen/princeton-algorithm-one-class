
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




