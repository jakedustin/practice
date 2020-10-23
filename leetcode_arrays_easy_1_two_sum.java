class leetcode_arrays_easy_1_two_sum {
    public static void main(String[] args) {
        int[] nums = new int[] {2,5,5,11};
        System.out.println(twoSum(nums,10).toString());
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[] {0};
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] < target && nums[i] != 0) {
                for (int j = i + 1; j < nums.length; ++j) {
                    if (nums[j] < target && nums[j] != 0) {
                        if (nums[i] + nums[j] == target) {
                            indices = new int[] {i,j};
                            return indices;
                        }
                    }
                }
            }
        }
        return indices;
    }
}
