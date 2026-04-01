class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int max = 0;
        for(int i : nums) {
            if(i == 0){
                max = Math.max(ans, max);
                ans = 0;
            } else {
                ans++;
            }
        }

        return Math.max(ans, max);
    }
}