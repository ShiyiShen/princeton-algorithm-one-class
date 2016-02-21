public class SortFactory {

	public Sort getSort(String type) {
		if(type.equalsIgnoreCase("BubbleSort"))
			return new BubbleSort();
		else if (type.equalsIgnoreCase("SelectionSort"))
			return new SelectionSort();

		return null;
	}

}