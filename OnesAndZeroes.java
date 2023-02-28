package dynamic_programing;

public class OnesAndZeroes {
	public static void main(String[] args) {
		OnesAndZeroes onesAndZeroes = new OnesAndZeroes();
		String[] strs = { "10", "0", "1" };
		System.out.println(onesAndZeroes.findMaxForm(strs, 1, 1));
	}

	public int findMaxForm(String[] strs, int m, int n) {
		int[][] dp = new int[m + 1][n + 1];
		for (String str : strs) {
			int zeros = 0;
			int ones = 0;

			for (int i = 0; i < str.length(); i++)
				if (str.charAt(i) == '0')
					zeros++;
				else
					ones++;

			for (int x = m; x >= zeros; x--) {
				for (int k = n; k >= ones; k--) {
					dp[x][k] = Math.max(dp[x][k], dp[x - zeros][k - ones] + 1);
				}
			}
		}
		return dp[m][n];
	}
}
