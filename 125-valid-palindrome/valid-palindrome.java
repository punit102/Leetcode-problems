class Solution {
    public boolean isPalindrome(String s) {
        boolean result = true;
        String lowerCaseString = s.toLowerCase();
        ArrayList<Character> plainGivenString = new ArrayList<>();
        for (int i = 0; i < lowerCaseString.length(); i++) {
            // NOTE:: ASCII value for 0 to 9 is 48 to 57
            // ASCII values for A to Z is 65 to 90
            // ASCII values for a to z is 97 to 122
            int asciiValue = (int)lowerCaseString.charAt(i);
            if((lowerCaseString.charAt(i) >= 'a' && lowerCaseString.charAt(i) <= 'z') || (asciiValue >= 48 && asciiValue <= 57)){
                plainGivenString.add(lowerCaseString.charAt(i));
            }
        }

        int actualMessageSize = plainGivenString.size();
        for(int i = 0, j = actualMessageSize-1 ; i < actualMessageSize/2 ; i++, j--) {
            if(plainGivenString.get(i) != plainGivenString.get(j)){
                result = false;
                break;
            }
        }
        return result;
    }
}