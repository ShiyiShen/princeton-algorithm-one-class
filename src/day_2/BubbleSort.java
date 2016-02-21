public class BubbleSort implements Sort {
	
	/* sort the array in desencing order: large -> small*/
	public int[] sortAnother(int[] arr){
		
		int tmp = 0;
		//loop through the array
		for(int i=0; i< arr.length;i++){
			for(int j=i+1; j<arr.length;j++){
				//swap the two elements when it's out of order
				if(arr[i] < arr[j]) {				
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}

	@Override
	public int[] doSort(int[] arr){			
		int tmp = 0;
		//loop through the array
		for(int i=0; i< arr.length;i++){
			for(int j=0; j<arr.length-i-1;j++){
				//swap the two elements when it's out of order
				if(arr[j] < arr[j+1]) {				
					tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}

	public static String arrayToString (int[] arr) {
		StringBuffer st = new StringBuffer();
		for(int i=0; i< arr.length;i++){
			st.append(arr[i]);
			st.append(" ");
		}
		return st.toString();
	}

	public static void main (String[] args){
		

	}

}