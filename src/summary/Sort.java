/* implementation of insetion sort */
public class InsertionSort {

	public static void sort(int[] A){
		int size = A.length;
		for(int i=0; i<size;i++){
			for(j=i;j>0&&less(A[j],A[j-1]);j--){
				exch(A, j, j-1)
			}
		}
	}

	private boolean less(int[] A, int i, int j){
		if(A[i] < A[j])
			return true;
		return false;
	}

	private void exch(int[] A, int i, int j){
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}

}

/* implementation of merge sort */
public class MergeSort {

	public int[] inputArray;
	private int[] tmpArray;

	public void sort () {
		int length = inputArray.length;
		this.tmpArray = new int[length];
		doMergeSort(inputArray, 0, length - 1);
	}

	private void doMergeSort(int[] arr, int lo, int hi){
		if(lo < hi){
			int middle = ( lo + hi ) / 2;
			doMergeSort(arr, lo, middle);
			doMergeSort(arr, middle, hi);
			mergeParts(lo, middle, hi);
		}
	}

	private void mergeParts(int lo, int middle, int hi){
		int[] tmpArray;
		for (int k = lo; k <= hi; k++) { 
			tmpArray[k] = inputArray[k];
		}

 		int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if(i > mid)              
            	inputArray[k] = tmpArray[j++];
            else if (j > hi)               
            	inputArray[k] = tmpArray[i++];
            else if (less(tmpArray[j], tmpArray[i])) 
            	inputArray[k] = tmpArray[j++];
            else                           
            	inputArray[k] = tmpArray[i++];
        }
	}
}

/*  implementation of quickst sort  */
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