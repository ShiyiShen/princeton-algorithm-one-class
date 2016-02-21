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