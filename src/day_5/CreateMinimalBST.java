/* Create a minimal BST from a sorted array */

public void createMinimalBST (int[] arr) {
	createMinimalBST(arr, 0, arr.length - 1);
}

private node createMinimalBST (int[] arr, int start, int end) {
	if(start > end)
		return null;	

	int middle = (end + start) / 2;

	Node node = new Node(arr[middle]);
	node.left = createMinimalBST(arr, start, middle - 1);
	ndoe.right = createMinimalBST(arr, middle + 1, end);

	return node;
}
