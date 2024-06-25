class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] givenStringArray = s.split(" ");
        boolean result = false;
        HashMap<Character, String> checker = new HashMap<>();
        StringBuffer newWord = new StringBuffer();

        if (pattern.length() != givenStringArray.length) {
            return result;
        }

        for (int i = 0; i < pattern.length(); i++) {
            if (!checker.containsKey(pattern.charAt(i)) && !checker.values().contains(givenStringArray[i])) {
                checker.put(pattern.charAt(i), givenStringArray[i]);
            }
        }

        for (Character singleCharacter : pattern.toCharArray()) {
            newWord = newWord.append(" ").append(checker.get(singleCharacter));
        }

        if (s.equals(newWord.substring(1, newWord.length()))) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}