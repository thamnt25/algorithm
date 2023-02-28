package dynamic_programing;

public class Candy {
	public static void main(String[] args) {
		int[] ratings = { 1, 0, 2 };
		Candy c = new Candy();
		System.out.println(c.candy(ratings));
	}

	public int candy(int[] ratings) {
		int[] candies = new int[ratings.length];
		for (int i = 0; i < ratings.length; i++) {
			candies[i] = 1;
		}
		for (int i = 1; i < ratings.length; i++) {
			if (ratings[i] > ratings[i - 1]) {
				candies[i] = candies[i - 1] + 1;
			}
		}

		int sum = candies[candies.length - 1];

		for (int i = ratings.length - 2; i >= 0; i--) {
			if (ratings[i] > ratings[i + 1]) {
				candies[i] = Math.max(candies[i + 1] + 1, candies[i]);
			}
			sum += candies[i];
		}
		return sum;
	}
}
