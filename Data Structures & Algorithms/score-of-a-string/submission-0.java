class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        int left = 0;
        for(int right = 1; right < s.length(); right++) {
            sum += Math.abs(s.charAt(right) - s.charAt(left));
            left++; 
        }
        return sum;
    }
}