/* return each level of node in the BT as a linked list */
public void BTLinkedList (Node root) {
	/* return array list of head of all linkedlist */
	ArrayList<LinkedList<Node>> lists = new ArrayList<LinkedList<Node>>();
	createLevelLinkedList(lists, root, 0);
	return lists;
}

private void createLevelLinkedList (ArrayList<Node> lists, Node root, int level) {
	
	if(root == null)
		return null;

	LinkedList<Node> list = new LinkedList<Node>();
	if(lists.size == level){
		list = new LinkedList();
	}else{
		list = lists.get(level);
	}

	list.add(root);
	createLevelLinkedList(root.left, lists, level + 1);
	createLevelLinkedList(root.right, lists, level + 1);
}