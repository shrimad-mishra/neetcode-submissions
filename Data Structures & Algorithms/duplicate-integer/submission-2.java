class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> ans = new HashMap();

        for(int i : nums) {
            ans.put(i, ans.getOrDefault(i, 0) + 1);
            if(ans.get(i) > 1)
                return true;
        }

        return false;
    }
}