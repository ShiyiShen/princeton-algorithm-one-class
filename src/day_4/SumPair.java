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