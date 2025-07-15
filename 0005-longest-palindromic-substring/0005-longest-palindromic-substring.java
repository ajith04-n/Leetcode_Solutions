class Solution {
    public String longestPalindrome(String text) {
        if (text == null || text.length() < 1) return "";
        int bestStart = 0, bestLength = 0;
        for (int center = 0; center < text.length(); center++) {
            int left = center;
            int right = center;
            while (left >= 0 && right < text.length() && text.charAt(left) == text.charAt(right)) {
                if (right - left + 1 > bestLength) {
                    bestStart = left;
                    bestLength = right - left + 1;
                }
                left--;
                right++;
            }
            left = center;
            right = center + 1;
            while (left >= 0 && right < text.length() && text.charAt(left) == text.charAt(right)) {
                if (right - left + 1 > bestLength) {
                    bestStart = left;
                    bestLength = right - left + 1;
                }
                left--;
                right++;
            }
        }
        return text.substring(bestStart, bestStart + bestLength);
    }
}