package dynamic_programing;

public class MaximizetheTopmostElementAfterKMoves {
	public static void main(String[] args) {
		System.out.println("MaximizetheTopmostElementAfterKMoves");
		int[] nums = { 91, 98, 17, 79, 15, 55, 47, 86, 4, 5, 17, 79, 68, 60, 60, 31, 72, 85, 25, 77, 8, 78, 40, 96, 76,
				69, 95, 2, 42, 87, 48, 72, 45, 25, 40, 60, 21, 91, 32, 79, 2, 87, 80, 97, 82, 94, 69, 43, 18, 19, 21,
				36, 44, 81, 99 };
		System.out.println(maximumTop(nums, 2));
	}

	public static int maximumTop(int[] nums, int k) {
		int top = -1;
		if (nums.length == 1 && k % 2 == 1)
			return top;
		else {
			for (int i = 0; i < Math.min(k - 1, nums.length); i++) {
				top = Math.max(top, nums[i]);
			}
			if (k < nums.length) {
				top = Math.max(top, nums[k]);
			}
		}
		return top;
	}
}
