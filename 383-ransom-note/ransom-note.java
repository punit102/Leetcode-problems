class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean result = true;
        int lengthOfMagazine = magazine.length();
        int lengthOfRansomNote = ransomNote.length();
        HashMap<Character, Integer> checkOccurnace = new HashMap<>();
        for (int i = 0; i < lengthOfMagazine; i++){
            if(!checkOccurnace.containsKey(magazine.charAt(i))){
                checkOccurnace.put(magazine.charAt(i), 1);
                System.out.println("IF check Character: " + magazine.charAt(i) + "it value: "+checkOccurnace.get(magazine.charAt(i)));
            } else {
                int temp_value = checkOccurnace.get(magazine.charAt(i));
                // System.out.println("ELSECheck increment: " +temp_value);
                checkOccurnace.put(magazine.charAt(i), temp_value + 1);
                // System.out.println("IF check Character: " + magazine.charAt(i) + "it value: "+checkOccurnace.get(magazine.charAt(i)));
                // System.out.println(" ELSE check Character: " + magazine.charAt(i) + "it value: "+checkOccurnace.get(magazine.charAt(i)));
            }
        }

        for (int i = 0 ; i < lengthOfRansomNote; i++) {
            if(checkOccurnace.containsKey(ransomNote.charAt(i))){
                int temp_value = checkOccurnace.get(ransomNote.charAt(i));
                //  System.out.println(" SECOND ECheck increment: " +temp_value);
                checkOccurnace.put(ransomNote.charAt(i), temp_value - 1);
                int second_check =  checkOccurnace.get(ransomNote.charAt(i));
                if(second_check < 0){
                    result = false;
                break;
                }   
                // System.out.print("check rasnsome note INt: " + checkOccurnace.get(ransomNote.charAt(i) - 1));
                // checkOccurnace.put(ransomNote.charAt(i), checkOccurnace.get(ransomNote.charAt(i) - 1));
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}