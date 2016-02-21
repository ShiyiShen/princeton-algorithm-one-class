public class TreeEntry {

	private int data;
	private TreeEntry left;
	private TreeEntry right;

	TreeEntry (int c) {
		this.data = c;
		left = null;
		right = null;
	}

	public int getData () {
		return this.data;
	}

	public TreeEntry getLeft () {
		return this.left;
	}

	public TreeEntry getRight () {
		return this.right;
	}

	public void setLeft (TreeEntry t) {
		this.left = t;
	}

	public void setRight (TreeEntry t) {
		this.right = t;
	}

	public void setData (int c) {
		this.data = c;
	}

	public void printTreeEntry(){
		System.out.print("Center: " + data);
		
		if(left != null) 
			System.out.print("Left: " + left.getData());
		else 
			System.out.print("Left: empty");

		if(right != null) 
			System.out.print("Right: " + right.getData());
		else
			System.out.print("Right: empty");
	}
}