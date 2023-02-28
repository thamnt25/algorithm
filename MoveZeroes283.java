import java.util.Arrays;

public class MoveZeroes283 {
    public static void main(String[] args) {
        int[] nums = {0};
        moveZeroes(nums);
    }

    //Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
    public static void moveZeroes(int[] nums) {
        int start = 0;
        //int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                //ans[start] = nums[i];
                nums[start] = nums[i];
                start++;
            }
        }
        for (int i = start; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
