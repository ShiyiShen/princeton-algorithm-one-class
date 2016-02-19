import java.util.Scanner;

public class PhoneNumber {
	
	private String st;

	public PhoneNumber (String s) {
		this.st = s;
	}

	public String getPhoneNumber(){
		return this.st;
	}

	public int hashCode () {

		int hash = 0;
		int M = 10;
		int R = 31;

		for(int i = 0; i < st.length(); i++){
			char c = st.charAt(i);
			hash = (R * hash + c) % M;
			//hash = (((area * R + exch) % M) * R + ext) % M;
		}

		return hash;
	}

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String st = scan.next();
		PhoneNumber ph = new PhoneNumber(st);
		System.out.println("The hash value for '" + ph.getPhoneNumber() + "' is:  " + ph.hashCode());
	}
}


