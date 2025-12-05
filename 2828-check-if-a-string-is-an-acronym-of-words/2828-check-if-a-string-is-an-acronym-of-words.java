class Solution {
    public boolean isAcronym(List<String> words, String s) {
        // If acronym length doesn't match words count, return false immediately
        if (words.size() != s.length()) {
            return false;
        }

        // Compare each first character with s
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).charAt(0) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
