class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> dict = new HashMap<>();
        
        for (int num : nums) {
            dict.put(num, dict.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = 
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        maxHeap.addAll(dict.entrySet());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll().getKey();
        }

        return result;
    }
}
