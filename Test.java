import java.util.Scanner;

public class Test {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String st = scan.next();
		System.out.println("The hash value for '" + st + "' is: ");
		//System.out.pintln(getHashValue(s));	

		int hash = 0;
		int M = 10;
		int R = 31;

		for(int i = 0; i < st.length(); i++){
			char c = st.charAt(i);
			hash = (R * hash + c) % M;
		}
		System.out.println(hash);	
	}
}