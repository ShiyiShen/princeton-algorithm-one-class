/* sort linked list */
public class SortZeroOne{

	public Node sort(Node head) {
		/*  assume 1 first, then 0 */
		/* Go through the list */
		/* if 0 found, point to next element that’s 1 */
		/* add the 0 to then head of 0 list */
		/* when reach the end the list, point the tail to the first 0 found */
		
		if(head == null)
			return null;

		Node current = head;
		Node zero_head = null;

		while (current != null){
			/* start with the second element */
			if(current.next !=null && current.next.data == 0){
				current.next.next = zero_head;
				zero_head = current.next;
				current.next = current.next.next;
			}
			current = current.next;
		}

		/* take care of 1st item in the list, head may need to change */
		if(head.data == 0){
			head.next = zero_head;
			zero_head = head;
			head = head.next;
		}

		/* connect the two list */
		current.next = zero_head;

		return head; 
	}

	public Node sortSwap(Node head){
		/* initialize the values */
		Node p = findNext(head,1);
		Node q = findNext(head,0);

		while(p != null && q != null){
			
			/* 'swap' value */
			p.data = 0;
			q.data = 1;

			p = findNext(p,1);
			q = findNext(q,0);
		}
	}

	private Node findNext (Node node, int data){
		while(node != null && tmp.data != data){
			node = node.next;
		}
		return node;
	}

}


/* find out a^2 + b^2 = c^2 + d^2 */
public void findSumPair(){
	Hashtable<integer, ArrayList> pairs = sumPair(1000);
	printResults(pairs);
}
private Hashtable<integer, ArrayList> sumPair(int max){
	Hashtable<integer, ArrayList> hash = new Hashtable<integer, ArrayList>();
	for(int a=0; a<max; a++){
		for(int b=a;b<max; b++){
			int apower = a * a * a;
			int bpower = b * b * b;
			int sum = apower + bpower;

			int[][] arr = new int[1][2]();
			arr[0][0] = a;
			arr[0][1] = b;

			/* if the sum is find before, add the pair to  */
			if(hash.containsKey(sum)){
				ArrayList list = hash.getValue(sum);
			}else{
				ArrayList list = new ArrayList();
			}
			list.add(arr);
			hash.put(apower + bpower);
		}
	}
	return hash;
}
private void printResults(Hashtable<integer, ArrayList> hash){
	for(int k : hash.keySet()){
		printResultInArrayList(hash.get(k));
	}
}
private void printResultInArrayList(ArrayList arr){
	for(int i=0;i<arr.length();i++){
		for(int j=i+1;j<arr.length();j++){
			int a = arr[i][0];
			int b = arr[i][1];
			int c = arr[j][0];
			int d = arr[j][1];
			System.out.println(a + ", " + b + ", " + c + ", " + d);
		}
	}
}

