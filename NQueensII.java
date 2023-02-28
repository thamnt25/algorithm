package backtracking;

public class NQueensII {
	int count = 0;
	boolean[] diags1;
	boolean[] diags2;
	boolean[] cols;

	public static void main(String args) {
		NQueensII nqueensII = new NQueensII();
		int n = 5;

		System.out.print(nqueensII.totalNQueens(n));
	}

	public int totalNQueens(int n) {
		diags1 = new boolean[n * 2];
		diags2 = new boolean[n * 2];
		cols = new boolean[n];
		return count;
	}

	public void backtracking(int row, int n) {
		if (row == n)
			count++;
		else {
			for (int col = 0; col < n; col++) {
				if (!cols[col]) {

				}
			}
		}
	}

}
