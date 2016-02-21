public class QuickSort {

	int[] myArray;
	int size;

	QuickSort(int[] arr){
		myArray = arr;
		size = arr.length;
	}

	public void sort(){
		sort(myArray, 0, size);
	}

	private void sort(int[] A, int lo, int hi) {
		if(hi < lo) return;

		int j = partition(A, lo, hi);
		sort(A, lo, j-1);
		sort(A, j+i, hi);	
	}

	//https://www.youtube.com/watch?v=8hHWpuAPBHo
	private int partition (int[] A, int lo, int hi){
		int i = lo;
		int j = hi + 1;
		//pick the first item on the array as the partition point
		int v = A[lo];

		while(true){
			//start from low end, find an item greater than v
			while(less(A[++i], v))
				if (i == hi) break;
			//start from high end, find an iterm smaller than v
			while(less(v, A[j--])
				if(j == lo) break;

			//break when two pointers meet	
			if(i >= j) break;

			//swap the two items found
			exch(A, i, j);
		}
		exch(a, lo, j);
		return j;
	}

}