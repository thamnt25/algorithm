package dynamic_programing;
import java.util.List;

public class Triangle120 {

	public static void main(String[] args) {
		int[][] triangle = { { -1 }, { 2, 3 }, { 1, -1, -3 } };

		//System.out.print(minimumTotal(triangle));
	}

	public int minimumTotal(List<List<Integer>> triangle) {
		int m = triangle.size() - 1;
		int n = triangle.get(m).size();
		int[] visitted = new int[n];
		for (int i = 0; i < n; i++)
			visitted[i] = triangle.get(m).get(i);

		for (int layer = m - 1; layer >= 0; layer--) {
			List<Integer> curLayer = triangle.get(layer);
			for (int i = 0; i < curLayer.size(); i++) {
				visitted[i] = Math.min(visitted[i] + curLayer.get(i), visitted[i + 1] + curLayer.get(i));
			}
		}
		return visitted[0];
	}
}
