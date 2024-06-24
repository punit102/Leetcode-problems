class Solution {
    public boolean isValid(String s) {
        boolean result = false;
        Stack<Character> checkResult = new Stack<>();
        int lengthOFGivenString = s.length();
        if (lengthOFGivenString <= 1) {
            return result;
        }

        if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') {
            return result;
        }

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                checkResult.push(c);
            } else if (c == ')' && checkResult.empty()) {
                return result;
            } else if (c == ']' && checkResult.empty()) {
                return result;
            } else if (c == '}' && checkResult.empty()) {
                return result;
            } else if (c == ')' && checkResult.lastElement() == '(') {
                checkResult.pop();
            } else if (c == ']' && checkResult.lastElement() == '[') {
                checkResult.pop();
            } else if (c == '}' && checkResult.lastElement() == '{') {
                checkResult.pop();
            } else if (c == ')' || c == ']' || c == '}') {
                checkResult.push(c);
            }

        }
        return checkResult.empty() ? true : false;
    }
}