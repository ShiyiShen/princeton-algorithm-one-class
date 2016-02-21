/* from small to large */
public int[] mergeTwoSortedArray (int[] A, int[] B){
	int lo = 0;
	int mi = 0;
	int size = A.length + B.length;
	
	int[] merged = new int[size]; 

	for(int k =0; k<size; k++){
		if(lo > A.length) merged[k] = B[mi++];
		else if(mi > B.length) merged[k] = A[lo++];
		else if(A[lo] > B[mi]) merged[k] = B[mi++];
		else merged[k] = A[lo++];
	}
	return merged[k];	
}