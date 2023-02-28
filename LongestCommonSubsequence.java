package dynamic_programing;

public class LongestCommonSubsequence {
	public static void main(String[] args) {
		System.out.println("Longest common subsequence");
		int[] S1 = { 1, 0, 0, 1, 0, 1, 0, 1 };
		int[] S2 = { 0, 1, 0, 1, 1, 0, 1, 1, 0};
		lsc(S1, S2);
	}

	public static void lsc(int[] X, int[] Y) {
		int[][] c = lcsLenght(X, Y);
		printLcs(c, X, X.length, Y.length);
	}

	public static int [][] lcsLenght(int[] X, int[] Y) {
		int n1 = X.length + 1;
		int n2 = Y.length + 1;
		int[][] c = new int[n1][n2];
		//char[][] b = new char[n1][n2];
		for (int i = 0; i < n1; i++) {
			c[i][0] = 0;
		}
		
		for (int j = 0; j < n2; j++) {
			c[0][j] = 0;
		}
		for (int i = 1; i < n1; i++) {
			for (int j = 1; j < n2; j++) {
				if (X[i - 1] == Y[j - 1]) {
					c[i][j] = c[i - 1][j - 1] + 1;
					//b[i][j] = '*';
				} else if (c[i][j - 1] < c[i - 1][j]) {
					c[i][j] = c[i - 1][j];
					//b[i][j] = '#';
				} else {
					c[i][j] = c[i][j - 1];
					//b[i][j] = '$';
				}
			}
		}
		return c;
	}

	public static void printLcs(int[][] c, int[] X, int i, int j) {
		if (i == 0 || j == 0)
			return;
		if ((c[i][j] - c[i - 1][j - 1]) == 1) {
			printLcs(c, X, i - 1, j - 1);
			System.out.print(X[i - 1]);
		} else if (c[i][j] == c[i - 1][j])
			printLcs(c, X, i - 1, j);
		else
			printLcs(c, X, i, j - 1);
	}
}

//010101
