package dynamic_programing;

public class JumpGameii {
	public static void main(String[] agrs) {
		System.out.println("JumpGameII");
		JumpGameii jumpGame = new JumpGameii();
		int[] nums = { 1, 1, 2, 1, 2, 1, 9};
		System.out.println(jumpGame.jump(nums));
	}

	public int jump(int[] nums) {
		int jumps = 0;
		int l = 0;
		int r = 0;
		while (r < nums.length - 1) {
			int farthest = 0;
			for (int i = l; i <= r; i++) {
				farthest = Math.max(farthest, i + nums[i]);
			}
			l = r + 1;
			r = farthest;
			jumps++;
		}
		return jumps;
	}
}
