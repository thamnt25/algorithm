import java.util.HashMap;

public class MajorityElement169 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.print(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        int majorEle = nums[0];
        int countEle = 1;
        for (int i = 0; i < nums.length; i++) {
            if (counts.containsKey(nums[i])) {
                int val = counts.get(nums[i]);
                val++;
                if (val > countEle) {
                    countEle = val;
                    majorEle = nums[i];
                }
                counts.put(nums[i], val);

            } else counts.put(nums[i], 1);
        }
        return majorEle;
    }
}
