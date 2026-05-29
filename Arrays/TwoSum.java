public class TwoSum {
    static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    int ans[] = {i, j};
                    return ans;
                }
            }
        }
        int ans[] = {};
        return ans;
}
    public static void main(String[] args) {
        int[] nums = {2, 8, 10, 15};
        int target = 10;
        twoSum(nums, target);
    }
}