public class CompressBad{

	public static void main (String[] args){
		
		String s = "aabcccccaaa";
		System.out.println("Original string: " + s);

		int size = s.length();
		//convert string to char array
		char[] stringArray = s.toCharArray();
		char last = s.charAt(0);

		String compressVersion = "";
		int count = 1;

		//loop through the char array
		for(int i=1; i<size; i++){
			if(last == s.charAt(i)){
				count++;
			}else{
				compressVersion += last + "" + count;
				last = s.charAt(i);
				count = 1;
			}	
		}
		//print out the very last column
		compressVersion += last + "" + count;

		//make sure the compressed version is shorter than the original
		if(compressVersion.length() >= size){
			System.out.println("Greater than Original size. ");
		}

		System.out.println("New string: " + compressVersion);
	}
}