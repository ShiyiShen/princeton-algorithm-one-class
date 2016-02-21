import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SortUnitTest {

	@Test
	public static void testSort(String type){

		int[] myArray = new int[6];
		myArray[0] = 1;
		myArray[1] = 3;
		myArray[2] = 5;
		myArray[3] = 12;
		myArray[4] = 124;
		myArray[5] = 56;
		
		SortFactory sort = new SortFactory();
		Sort sortMethod = sort.getSort(type);
		int[] sortedArray = sortMethod.doSort(myArray);

		try{
			assertTrue(124 == sortedArray[0]);
			assertTrue(56 == sortedArray[1]);
			assertTrue(12 == sortedArray[2]);
			assertTrue(5 == sortedArray[3]);
			assertTrue(3 == sortedArray[4]);
			assertTrue(1 == sortedArray[5]);
			System.out.println(type + " - Sorted correctly. ");
		}catch(Exception e){
			System.out.println("Error");
		}catch(AssertionError a) {
			System.out.println(type + " - Sorted incorrectly. ");
		}

	}

	public static void main (String[] args){
		
		/* bubble sort */
		testSort("BubbleSort");
		/* selection sort */
		testSort("SelectionSort");

	}
}