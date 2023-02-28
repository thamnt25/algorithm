package dynamic_programing;

public class ContainerWithMostWater {
	public static void main(String[] args) {
		System.out.println("container with most water");
		ContainerWithMostWater con = new ContainerWithMostWater();
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println("" + con.maxArea(height));
	}

	public int maxArea(int[] height) {
		int maxArea = Integer.MIN_VALUE;
		int left = 0;
		int right = height.length - 1;
		while (left < right) {
			int hl = height[left];
			int hr = height[right];
			int shortestHeight = Math.min(hl, hr);
			maxArea = Math.max(maxArea, shortestHeight * (right - left));
			if (hl <= hr)
				while (left < right && hl >= height[left])
					left += 1;
			else
				while (left < right && hr >= height[right])
					right -= 1;
		}

		return maxArea;
	}
}
