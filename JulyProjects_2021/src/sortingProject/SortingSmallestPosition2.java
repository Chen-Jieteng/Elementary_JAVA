package sortingProject;

public class SortingSmallestPosition2 {
	
	public int minPosition(int[] a, int from, int to) {
		int smallestPosition = from;
		for(int i = from + 1; i <= to; i++) {
			if(a[i] < a[smallestPosition]) {
				smallestPosition = i;
			}
		}
		return smallestPosition;
	}
	
	public void sort(int[] a) {
		for(int i = 0; i < a.length - 1; i++) {
			int smallestPosition = minPosition(a, i, a.length - 1);
			int temp = a[i];
			a[i] = a[smallestPosition];
			a[smallestPosition] = temp;
		}
	}
}
