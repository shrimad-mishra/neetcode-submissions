class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) 
            return false;

        Map<Character, Integer> dict = new HashMap<>();

        for (char i : s.toCharArray()) {
            dict.put(i, dict.getOrDefault(i, 0) + 1);
        }

        for (char i : t.toCharArray()) {
            if (!dict.containsKey(i)) 
                return false;

            dict.put(i, dict.get(i) - 1);
            if (dict.get(i) < 0) 
                return false;
        }
        
        return true;
    }
}