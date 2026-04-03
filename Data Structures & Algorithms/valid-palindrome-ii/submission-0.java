class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != 
                Character.toLowerCase(s.charAt(right))) {

                return isValid(s, left + 1, right) || 
                       isValid(s, left, right - 1);
            }

            left++;
            right--;
        }

        return true;
    }

    private boolean isValid(String s, int left, int right) {
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != 
                Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}