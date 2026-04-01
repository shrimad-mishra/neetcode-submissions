class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> dict = new HashMap<>();
        for (int i : nums) {
            if (dict.containsKey(i)) {
                return true;
            }
            dict.put(i, i);
        }
       return false;
    }
}