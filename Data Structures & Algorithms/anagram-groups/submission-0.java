class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for(String str : strs) {
            int[] count = new int[26];
            //Tạo key là một chuỗi đếm
            for(char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            //Thêm value vào key nối đuôi nhau
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(str);
        }
        return new ArrayList<>(res.values());
    }
}
