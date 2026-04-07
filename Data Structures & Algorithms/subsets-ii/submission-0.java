class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> rs = new ArrayList<>();
        Arrays.sort(nums);
        backtracking(nums, 0, new ArrayList<>(), rs);
        return rs;
    } 
    private void backtracking(int[] nums, int start, List<Integer> path, List<List<Integer>> result) {
        result.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            if(i > start && nums[i] == nums[i - 1])
                continue;
            path.add(nums[i]);
            backtracking(nums, i + 1, path, result);
            path.remove(path.size() - 1);
        }
    }
}
