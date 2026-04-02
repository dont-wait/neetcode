class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //create a map have key is index, value is freq
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            (a, b) -> freqMap.get(b) - freqMap.get(a)
        );
        maxHeap.addAll(freqMap.keySet());

        int[] result = new int[k];
        for(int i = 0; i < k; i++) 
            result[i] = maxHeap.poll();

        return result;
    }
}
