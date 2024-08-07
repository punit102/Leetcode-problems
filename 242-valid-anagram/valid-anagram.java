class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();

        for(char a: arr){
            if(!map.containsKey(a)){
                map.put(a, 1);
            } else{
                int tempCount = map.get(a);
                map.put(a, tempCount + 1);
            }
        }

        char[] arr2 = t.toCharArray();
        for(char aa: arr2){
            if(map.containsKey(aa)){
                int tempCount = map.get(aa);
                map.put(aa, tempCount - 1 );
            } else{
                map.put(aa, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            int key = entry.getValue();
            if(entry.getValue() != 0 ){
                return false;
            }
        }


        return true;
    }
}