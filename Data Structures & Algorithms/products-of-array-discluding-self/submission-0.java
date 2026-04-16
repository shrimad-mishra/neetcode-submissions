class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];

        int prev = 1, next = 1;

        for (int i = 0; i < n; i++) {
            pre[i] = prev;
            prev *= nums[i];
        }

        for (int i = n - 1; i >= 0; i--) {
            suf[i] = next;
            next *= nums[i];
        }

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = pre[i] * suf[i];
        }

        return ans;
    }
}