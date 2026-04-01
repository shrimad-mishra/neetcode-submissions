class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;

        for (String i : details) {
            int age = Integer.parseInt(i.substring(11, 13));
            if (age > 60) {
                ans++;
            }
        }

        return ans;
    }
}