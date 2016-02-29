public boolean isBST (TreeNode root) {
	return isBST(root, null, null);
}


private boolean isBST(TreeNode node, Integer min, Integer max){

	if(node == null)
		return true;


	if((min != null && node.data < min) ||
	   (max != null && node.data > max))
		return false; 

	if(!isBST(node.left, min, node.data)) ||
	   !isBST(node.right, node.data, max)) {
		return false;
	} 

	return true;
}