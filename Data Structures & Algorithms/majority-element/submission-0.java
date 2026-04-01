class Solution {
    public int majorityElement(int[] nums) {
        int size = nums.length;
        int threshold = size / 2;
        Map<Integer, Integer> dict = new HashMap<>();

        for (int num : nums) {
            int count = dict.getOrDefault(num, 0) + 1;
            dict.put(num, count);

            if (count > threshold) {
                return num;
            }
        }

        return -1;
    }
}
