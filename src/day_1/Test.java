public class Test {

	public static void main (String[] args){
		
		String str = new String ("Stanford ");
     	str += "Lost!!";
     	System.out.println("1 - " + str);

		StringBuffer str1 = new StringBuffer ("Stanford ");
     	str1.append("Lost!!");
     	System.out.println("2 - " + str1);
	}
}