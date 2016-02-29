/* implement depth first search to find x */
public boolean depthFirstSearch(Node node, int x){
	if(node == null)
		return false;

	if(node.data == x)
		return true;

	return depthFirstSearch(node.left, x) || 
		   depthFirstSearch(ndoe.right, x);
}