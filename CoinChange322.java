package binarytree_breadthfirstsearch;

import java.util.Arrays;

public class CoinChange322 {
	public static void main(String[] args) {
		CoinChange322 coinChange322 = new CoinChange322();
		int[] coins = { 1, 2, 5};
		System.out.print(coinChange322.coinChange(coins, 6));
	}

	public int coinChange(int[] coins, int amount) {
		/*Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] { amount, 0 });
		boolean[] visited = new boolean[amount +1];
		int ans = amount;
		visited[amount] = true;
		boolean check = false;
		if (amount == 0)
			return 0;
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int x = 0; x < size; x++) {
				int[] coinNumber = queue.remove();
				if (coinNumber[0] == 0) {
					ans = Math.min(coinNumber[1], ans);
					check = true;
				}
				for (int i = 0; i < coins.length; i++) {
					if (coinNumber[0] >= coins[i] && !visited[coinNumber[0] - coins[i]]) {
						queue.add(new int[] { coinNumber[0] - coins[i], coinNumber[1] + 1 });
						visited[coinNumber[0] - coins[i]] = true;
					}
				}
			}
		}
		if (check)
			return ans;
		else
			return -1;*/
		
	        int[] dp = new int[1+amount];
	        Arrays.fill(dp, 1+amount);
	        
	        dp[0] = 0;
	        for(int coin:coins){
	            for(int i=coin;i<1+amount;i++){
	                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
	            }
	        }
	        
	        return dp[amount] == 1 + amount? -1:dp[amount];
	}

}
