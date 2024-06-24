class Solution {
    public boolean isPalindrome(String s) {
        boolean result = true;
        String lowerCaseString = s.toLowerCase();
        ArrayList<Character> plainGivenString = new ArrayList<>();
        for (int i = 0; i < lowerCaseString.length(); i++) {
            int asciiValue = (int)lowerCaseString.charAt(i);
            if((lowerCaseString.charAt(i) >= 'a' && lowerCaseString.charAt(i) <= 'z') || (asciiValue >= 48 && asciiValue <= 57)){
                 System.out.println("Check char val: "+lowerCaseString.charAt(i));
                plainGivenString.add(lowerCaseString.charAt(i));
            }
        }

        int actualMessageSize = plainGivenString.size();
        System.out.println("Total size: "+actualMessageSize);
        for(int i = 0, j = actualMessageSize-1 ; i < actualMessageSize/2 ; i++, j--) {
            System.out.println("Initial char: "+plainGivenString.get(i));
            System.out.println("Last char: "+plainGivenString.get(j));
            System.out.print("----------------------");
            if(plainGivenString.get(i) != plainGivenString.get(j)){
                result = false;
                break;
            }
        }
        return result;
    }
}