package dynamic_programing;

public class DeleteOperationforTwoStrings583 {
	public static void main(String[] args) {
		System.out.print(minDistance("leetcode", "etco"));
	}

	public static int minDistance(String word1, String word2) {
		int m = word1.length();
		int n = word2.length();
		int[][] memo = new int[m + 1][n + 1];
		int lscLength = lcs(word1, word2, m, n, memo);
		return (m + n) - 2 * lscLength;

	}

	public static int lcs(String word1, String word2, int m, int n, int[][] memo) {
		if (memo[m][n] != 0)
			return memo[m][n];
		if (m == 0 || n == 0)
			return 0;
		if (word1.charAt(m - 1) == word2.charAt(n - 1)) {
			memo[m][n] = 1 + lcs(word1, word2, m - 1, n - 1, memo);
		} else {
			memo[m][n] = Math.max(lcs(word1, word2, m - 1, n, memo), lcs(word1, word2, m, n - 1, memo));
		}
		return memo[m][n];
	}

}
