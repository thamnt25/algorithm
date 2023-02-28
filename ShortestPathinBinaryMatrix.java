package binarytree_breadthfirstsearch;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathinBinaryMatrix {
	public static void main(String[] args) {
		System.out.println("ShortestPathinBinaryMatrix");
		ShortestPathinBinaryMatrix matrixBinary = new ShortestPathinBinaryMatrix();
		int[][] grid = { { 0, 0, 0 }, { 1, 0, 0 }, { 1, 1, 0 } };
		System.out.print(matrixBinary.shortestPathBinaryMatrix(grid));
	}

	public int shortestPathBinaryMatrix(int[][] grid) {
		int[][] direction = { { -1, 0 }, { -1, -1 }, { 0, -1 }, { 1, -1 }, { 1, 0 }, { 1, 1 }, { 0, 1 }, { -1, 1 } };
		int r = grid.length;
		int c = grid[0].length;
		boolean[][] visit = new boolean[r][c];
		Queue<int[]> queue = new LinkedList<>();
		if (grid[0][0] == 1)
			return -1;
		queue.add(new int[] { 0, 0 });
		visit[0][0] = true;
		int ans = 1;
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int[] pop = queue.remove();
				if (pop[0] == r - 1 && pop[1] == c - 1) {
					return ans;
				}

				for (int j = 0; j < 8; j++) {
					int nextX = pop[1] + direction[j][1];
					int nextY = pop[0] + direction[j][0];
					if (nextY >= 0 && nextY < r && nextX >= 0 && nextX < c) {
						if (grid[nextY][nextX] != 1 && !visit[nextY][nextX]) {
							queue.add(new int[] { nextY, nextX });
							visit[nextY][nextX] = true;
						}
					}
				}
			}
			ans++;
		}

		return -1;
	}
}
