class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // initialize the result array and
        // monolithic stack(which only store decreasing elements otherwise start poping
        // out the element)
        int[] result = new int[temperatures.length];
        Stack<Integer> monoStack = new Stack<>();

        // Start for loop from last Index of the array
        for (int i = temperatures.length - 1; i >= 0; i--) {

            // if current index temperature is higher thatn stack top() element then we
            // can't push it so we will poping untill smaller elements in the stack top or
            // wait untill the stack will empty
            while (!monoStack.isEmpty() && temperatures[i] >= temperatures[monoStack.peek()]) {
                monoStack.pop();
            }

            // After popping out all necessary elements - we do subtraction on stack pop
            // index - current array index
            if (!monoStack.isEmpty()) {
                result[i] = monoStack.peek() - i;
            }

            // push all th array elements index to stack
            monoStack.push(i);
        }

        return result;
    }
}