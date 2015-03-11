package week_1;

import stdlib.StdIn;
import stdlib.StdOut;

public class QuickFindUF {

	private int[] id;
	
	public static void main(String[] args){
//		int N = StdIn.readInt();
//		QuickFindUF uf = new QuickFindUF(N);
//		while(!StdIn.isEmpty()){
//			int p = StdIn.readInt();
//			int q = StdIn.readInt();
//			if(!uf.connected(p, q)){
//				uf.union(p, q);
//				StdOut.println(p + " " + q);
//			}
//		}
		
		QuickFindUF arr = new QuickFindUF(10);
		arr.union(2, 3);
		arr.union(1, 5);
		arr.union(3, 5);
		
		arr.printOutArray();
	}
	
	public void printOutArray(){
		for(int i=0; i<10; i++){
			System.out.println(i + " -> " + id[i]);
		}
	}
	
	public QuickFindUF(int N)
	{
		id= new int[N];
		for(int i = 0; i<N; i++){id[i] = i;}
	}
	
	public Boolean connected(int p, int q)
	{
		return id[p] == id[q];
	}
	
	public void union(int p, int q)
	{
		for(int i=0; i<id.length; i++){
			if(id[i] == id[p]){
				id[i] = id[q];
				System.out.println(i + " changed to "+ id[p]);
			}
		}
	}
	
}
