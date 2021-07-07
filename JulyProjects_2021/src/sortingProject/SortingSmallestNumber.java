package sortingProject;
//sort a number
public class SortingSmallestNumber {
	public int minElement(int[]a, int from, int to) {
		int smallest = a[from];
		for(int i = from + 1; i <= to; i++) {
			if(a[i] < smallest) {
				smallest = a[i];
			}
		}
		return smallest;
	}
}
