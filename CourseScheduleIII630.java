package binarytree_breadthfirstsearch;

import java.util.Arrays;
import java.util.PriorityQueue;

public class CourseScheduleIII630 {

	public static void main(String[] args) {
		int[][] sourses = { { 1, 2 }, { 2, 3 } };
		System.out.print(scheduleCourse(sourses));
	}

	public static int scheduleCourse(int[][] courses) {
		Arrays.sort(courses, (a, b) -> a[1] - b[1]);
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>((a, b) -> b - a);
		int currentTotalTime = 0;
		for (int[] c : courses) {
			if (currentTotalTime + c[0] <= c[1]) {
				queue.add(c[0]);
				currentTotalTime += c[0];
			} else if (!queue.isEmpty() && queue.peek() > c[0]) {
				currentTotalTime += c[0] - queue.poll();
				queue.add(c[0]);
			}
		}
		return queue.size();
	}
}
