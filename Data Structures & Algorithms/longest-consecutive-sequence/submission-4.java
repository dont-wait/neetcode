class Solution {
    public int longestConsecutive(int[] nums) {
        // Set<Integer> set = new HashSet<>();
        // for(int num : nums)
        //     set.add(num);
        
        // int longest = 0;
        // for(Integer num : set) {
        //     if(!set.contains(num - 1)) {
        //         int length = 1;
        //         while(set.contains(num + length))
        //             length++;
        //         longest = Math.max(longest, length);
        //     }
        // }
        // return longest;
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int current = 1;
        int longest = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1])
                continue;
            if(nums[i] == nums[i - 1] + 1)
                current++;
            else {
                longest = Math.max(longest, current);
                current = 1;
            }
        }
        return Math.max(longest, current);
    }
}
