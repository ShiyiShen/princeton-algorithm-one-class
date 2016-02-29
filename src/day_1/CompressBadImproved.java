/* aabcccccaaa to a2b1c5a3 */
public class CompressBadImproved{
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

	public static void main (String[] args){
		
		String s = "aabcccccaaadddd";
		System.out.println("Original string: " + s);

		int size = s.length();
		int newSize = countCompression(s);
		System.out.println("Original string size: " + size);
		System.out.println("Compressed string size: " + newSize);

		if(newSize >= size){
			System.out.println("Greater than Original size. ");
		}else{
					//convert string to char array
			char last = s.charAt(0);
			StringBuffer compressVersion = new StringBuffer();;
			int count = 1;

			//loop through the char array
			for(int i=1; i<size; i++){
				if(last == s.charAt(i)){
					count++;
				}else{
					compressVersion.append(last);
					compressVersion.append(count);
					last = s.charAt(i);
					count = 1;
				}	
			}
			//print out the very last column
			compressVersion.append(last);
			compressVersion.append(count);
			System.out.println("New string: " + compressVersion.toString());
		}
	}
}