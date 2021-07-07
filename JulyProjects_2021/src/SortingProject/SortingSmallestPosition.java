package SortingProject;

public class SortingSmallestPosition {
	public int minPosition(int[] a, int from, int to) {
		int smallestPosition = from;
		for(int i = from + 1; i <= to; i++) {
			if(a[i] < a[smallestPosition]) {
				smallestPosition = i;
			}
		}
		return smallestPosition;
	}
}
