class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> dict = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (dict.containsKey(complement)) {
                return new int[] { dict.get(complement), i };
            }
            dict.put(nums[i], i);
        }

        return new int[] {};
    }
}