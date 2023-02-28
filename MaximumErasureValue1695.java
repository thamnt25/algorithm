import java.util.HashSet;
import java.util.Set;

public class MaximumErasureValue1695 {
	int maxSum = Integer.MIN_VALUE;

	public static void main(String[] args) {
		MaximumErasureValue1695 maxValue = new MaximumErasureValue1695();
		int[] nums = { 5, 2, 1, 2, 5, 2, 1, 2, 5 };
		System.out.println(maxValue.maximumUniqueSubarray(nums));

	}

	public int maximumUniqueSubarray(int[] nums) {
		Set<Integer> visitted = new HashSet<Integer>();
		boolean[] arrvisitted = new boolean[10001];
		int sum = 0;
		int i = 0, j = 0;
		while (i < nums.length && j < nums.length) {
			if (!arrvisitted[nums[j]]) {
				sum += nums[j];
				maxSum = Math.max(sum, maxSum);
				// visitted.add(nums[j++]);
				arrvisitted[nums[j++]] = true;
			} else {
				sum -= nums[i];
				// visitted.remove(nums[i++]);
				arrvisitted[nums[i++]] = false;
			}
		}
		return maxSum;
	}
}
