public class Test {

	public static void main (String[] args){
		
		int[] myArray = new int[6];
		myArray[0] = 1;
		myArray[1] = 3;
		myArray[2] = 5;
		myArray[3] = 12;
		myArray[4] = 124;
		myArray[5] = 56;
		System.out.println("Original array: " + BubbleSort.arrayToString(myArray));
		SelectionSort.sort(myArray);
		System.out.println("Sorted array: " + BubbleSort.arrayToString(myArray));
	}
}