public class SelectionSort implements Sort {

	/* sort the array in desencing order: large -> small*/
	@Override
	public int[] doSort(int[] arr){		
		int N = arr.length;
		//loop through the array
		for(int i=0; i<N;i++){
			int index = i;

			for(int j=i+1; j<N;j++){
				//find the biggest element in the rest of the list
				if(greater(arr[j], arr[index])) 				
					index = j;
			}

			if(index != i)
				exch(arr, index, i);

			assert isSorted(arr, 0, i);
		}
		assert isSorted(arr);

		return arr;
	}

	/* check if a is larger than b */
	private boolean greater(int a, int b){
		return a > b;
	}

	/* swap two elements */
	private void exch(int[] arr, int i, int j){
		int tmp = arr[j];
		arr[j] = arr[i];
		arr[i] = tmp;
	}
	
	private boolean isSorted(int[] arr){
		return isSorted(arr, 0, arr.length);
	}

	private boolean isSorted(int[] arr, int start, int end){
		for(int i=start;i<end-1;i++){
			if(!greater(arr[i], arr[i+1])) return false;
		}
		return true;
	}
}