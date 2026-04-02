class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            if(map.containsKey(n))
                return n;
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        return -1;
    }
}