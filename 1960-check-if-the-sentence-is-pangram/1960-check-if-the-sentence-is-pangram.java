class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] arr = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            arr[c - 'a'] = true;
        }
        for (int i = 0; i < 26; i++) {
            if (!arr[i]) {
                return false;
            }
        }
        return true;
    }
}