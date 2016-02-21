import java.util.*;

public class TotalSales {

	// 1. Take the original list, convert it to hashtable
	// 2. If the element exists, add up values
	// 3. If no exist, add new element to the hash table

	public int[][] calculateTotalSales (int[][] record) {
		Hashtable<Integer, Integer> hash = new Hashtable<Integer, Integer>();
		
		/*  Take the original list, convert it to hashtable */
		for(int i=0; i<record.length; i++){
			
			int productID = record[i][0];
			int quantity = record[i][1];

			/* If the element exists, add up values */
			if(hash.containsKey(productID)){
				quantity = hash.get(productID) + quantity;	
			}
			hash.put(productID, quantity);
		}

		int[][] totals = new int[hash.keySet().size()][2];
		int index = 0;
		for(int key : hash.keySet()){
			totals[index][0] = key;
			totals[index][1] = hash.get(key);
			index = index + 1;
		}
		return totals;

	}

	public void printRecords(int[][] record){
		for(int i=0; i<record.length; i++){
			System.out.println(record[i][0] + " " + record[i][1]);
		}
	}

	public static void main (String[] args){

		TotalSales ts = new TotalSales();
		int[][] records = new int[5][2];
		
		records[0][0] = 123;
		records[0][1] = 1;
		records[1][0] = 456;
		records[1][1] = 1;
		records[2][0] = 789;
		records[2][1] = 1;
		records[3][0] = 789;
		records[3][1] = 1;
		records[4][0] = 123;
		records[4][1] = 1;

		System.out.println("Original Records: ");
		ts.printRecords(records);
		int[][] totals = ts.calculateTotalSales(records);

		System.out.println("Total Sales: ");
		ts.printRecords(totals);

	}
}