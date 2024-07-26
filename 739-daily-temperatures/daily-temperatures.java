class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> monoStack = new Stack<>();

        for(int i = temperatures.length - 1; i >= 0; i--){

            while(!monoStack.isEmpty() && temperatures[i] >= temperatures[monoStack.peek()]){
                monoStack.pop();
            }

            if(!monoStack.isEmpty()){
                result[i] = monoStack.peek() - i;
            }

            monoStack.push(i);
        }


        return result;
    }
}