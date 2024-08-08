class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String ss : tokens) {
            if ((ss.equals("+")) || (ss.equals("-")) || (ss.equals("/")) || (ss.equals("*"))) {
                int a = stack.pop();
                int b = stack.pop();
                int result = 0;
                if ((ss.equals("+")))
                    result = a + b;
                if ((ss.equals("*")))
                    result = a * b;
                if ((ss.equals("/")))
                    result = b / a;
                if ((ss.equals("-")))
                    result = b - a;
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(ss));
            }
        }
        return stack.pop();
    }
}