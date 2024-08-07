class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        // ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(String ss: strs){
            char[] charArray = ss.toCharArray();
            Arrays.sort(charArray);
            String temp = new String(charArray);
            System.out.println(temp);

            if(! map.containsKey(temp)){
                ArrayList<String> list = new ArrayList<>();
                list.add(ss);
                map.put(temp, list);
            } else{
                ArrayList<String> oldList = map.get(temp);
                oldList.add(ss);
                map.put(temp, oldList);
            }
        }

        for(Map.Entry<String, ArrayList<String>> entry: map.entrySet()){
            result.add(entry.getValue());
        }

// System.out.print("Lsit: "+ result);

       return result; 
    }
}