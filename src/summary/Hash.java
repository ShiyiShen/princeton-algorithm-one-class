/* return total sales for each product */
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
}

/* remove duplicates in a linkedlist */
public void removeDuplicatsLinkedList (Node head){
	/* can use hashset instead:  
		HashSet<Integer> set = new HashSet<Integer>();
		if(set.contains(x)){...}
		set.add(x)
	 */
	Hashtable<Integer, boolean> hash = new Hashtable<Integer, boolean>();
	Node node = head;
	if(head != null)
		hash.add(head.data, true);

	while(node != null) {
		if(hash.containsKey(node.next.data)){
			node.next = node.next.next;
		} else {
			hash.add(node.next.data, true);
		}
		node = node.next;
	}
}