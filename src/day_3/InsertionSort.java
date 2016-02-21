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