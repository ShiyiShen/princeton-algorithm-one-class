package week_1;

public class QuickUnionUF {

	private int[] id;
	private int[] sz;
	
	public QuickUnionUF(int N){
		id= new int[N];
		sz = new int[N];
		for(int i = 0; i<N; i++){
			id[i] = i;
			sz[i] = 1;
		}		
	}
	
	private int root(int i){
		while(i != id[i]){ 			
			id[i] = id[id[i]];
			i = id[i];
		}
		return i;
	}
	
	private boolean connected(int p, int q)
	{	
		return root(p) == root(q);
	}
	
	public void union (int p, int q){
		int i = root(p);
		int j = root(q);
//		id[i] = j;
		if(sz[i] <= sz[j]){id[i] = j; sz[j]+=sz[i];}
		else {id[j] = i; sz[i]+=sz[j];}
	}
	
	public void printOutArray(){
		for(int i=0; i<10; i++){
			System.out.println(i + " -> " + id[i]);
		}

	}
	
	public static void main(String[] args){
		
		QuickUnionUF arr = new QuickUnionUF(10);
		arr.union(3,6);
		arr.union(4,5);
		arr.union(6,1);
		arr.union(7,1);
		arr.union(3,0);
		arr.union(4,7);
		
		System.out.println(arr.connected(1, 3));
		System.out.println(arr.connected(1, 2));

		arr.printOutArray();
	}
	
}
