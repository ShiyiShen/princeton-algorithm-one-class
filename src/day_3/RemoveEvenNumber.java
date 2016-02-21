public Stack<Integer> removeEvenNumber (Stack<Integer> s){
	Stack tmp = new Stack();
	while (!s.isEmpty()){
		int i = s.pop();
		if(i % 2 != 0)
			tmp.push(i);
	}

	while(!tmp.isEmpty){
		s.push(tmp.pop());
	}

	return s;
}