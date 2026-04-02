class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] str = s.toCharArray();
        int n = s.length();
        for(int i = 0; i < n / 2; i++)
            if(str[i] != str[n - i - 1])
                return false;
        return true;
    }
}