/* recursive solution */
public int binarySearch(int[] arr, int s){
	return binarySearch(arr, s, 0, arr.length-1, s);
}

/* return the position of the integer found */
/* not found, return -1 */
private int binarySearch(int[] arr, int s, int left, int right){	
	
	if(left > right) 
		return -1;
	
	int middle = (left + right ) /2;
	
	if(s == arr[middle]) 
		return middle;
	else if (s < arr[middle])
		return binarySearch(arr, left, middle - 1, s);
	else if 
		return binarySearch(arr, middle + 1, right, s);
}

/* iterative solution */
public int binarySearch2(int[] arr, int x){
	int left = 0;
	int right = arr.length-1;

	while(left <= right){
		int middle = (left + right ) /2;

		if(arr[middle] == x)
			return middle;
		else if(x < arr[middle]){
			right =  middle - 1;
		}else {
			left = middle + 1;
		}
	}

	return -1;
}