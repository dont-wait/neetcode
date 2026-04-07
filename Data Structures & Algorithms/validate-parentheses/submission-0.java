class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(Character c: s.toCharArray()) {
            if(c == '{' || c == '(' || c == '[')
                st.push(c);
            else {
                if(st.isEmpty())
                    return false;
                Character head = st.pop();
                if(c == '}' && head != '{')
                    return false;
                if(c == ')' && head != '(')
                    return false;
                if(c == ']' && head != '[')
                    return false;
            }
        }
        return st.isEmpty();
    }
}
