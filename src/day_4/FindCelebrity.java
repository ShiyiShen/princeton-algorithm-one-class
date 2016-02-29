int findCelebrity(int N){
	for(int i=0;i<N;i++){
		if(isCelebrity(i, N)){
			return i;
		}
	}
	return -1;
}

boolean isCelebrity(int candidate, int people){
	for(int i=0;i<people;i++){
		if(i!=candidate){
			//terminate when finding candidate knows another person
			//terminate when finding a person doesn't know the candidate
			if(knows(candidate, i) || !knows(i, candidate))
				return false;
		}
	}
	return true;
}




int findCelebrity(int N){
	//key is one person, value is how many people know that person
	Hashtable<integer, integer> list = new Hashtable<integer, integer>();
	for(int i=0; i<N; i++}{
		for(int j=i+1;j<N;j++){
			//if i knows j
			if(knows(i,j)){
				int x = 1;
				//index j
				if(list.containsKey(j)){
					x += contacts.get(j);
				}else{
					list.add(j);
				}
				list.set(j) = x;
			}

		}
	}

	for(int key : list){
		if(list.get(key) == N-1){
			return key;
		}
	}

	return -1;
}

Hashtable<integer, ArrayList> network = new Hashtable<integer, ArrayList>();


int findCelebrity(int N){
	for(int x : network.keySet()){
		if(network.get(x).length() == N-1)
			return x;
	}
	return -1;
}

boolean knows(int a, int b){
	if(network.containsKey(a)){
		ArrayList list = network.get(a);
		for(int x : list){
			if(x == b)
				return true;
		}
	}
	return false;
}