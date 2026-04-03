class Solution {
    public int[] sortArray(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int min_idx = i;

            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] < nums[min_idx]) {
                    min_idx = j;
                }
            }

            int tmp = nums[min_idx];
            nums[min_idx] = nums[i];
            nums[i] = tmp;
        }

        return nums;
    }
}