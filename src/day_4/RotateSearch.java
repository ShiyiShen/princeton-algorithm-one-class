public int findMinimal(int[] arr){

	int left = 0;
	int right = arr.length-1;
	return findMinimal(arr, left, right);
}

//find the picece that is out of order
private int findMinimal(int[] arr, int left, int right){
	if(arr[left] < arr[right])
		reurn left;
	
	int middle = (left + right)/2;	
	if(arr[left] > arr[middle]){
		findMinimal(arr, left, middle);
	}else{
		findMinimal(arr, middle+1, right);
	}
}


public int search(int[] arr, int x){
	
	int size = arr.length-1;
	/* find the point that the array is out of order */
	for(int i=1; i<size-1;i++){
		if(arr[i-1] > arr[i]){
			j = i-1;
			break;
		}
	}

	int left;
	int right;
	if(arr[j] == x)
		return j;
	else if(x > arr[j]){
		left = j+1;
		right =  size-1;
	}else{
		left = 0;
		right = j-1;
	}

	return search(arr, x, left, right);
}

private int binarySearch(int[] arr, int x, int left, int right){
	if(left > right)
		return -1;

	int middle = (left + right)/2;
	if(arr[middle] == x)
		return middle;
	else if(x > arr[middle])
		return binarySearch(arr, x, left, middle-1);
	else 
		return binarySearch(arr, x, middle+1, right);

}