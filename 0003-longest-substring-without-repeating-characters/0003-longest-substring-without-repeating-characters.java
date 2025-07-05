class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> sh = new HashSet<>();
        int l = 0, max = 0;
        for (int r = 0; r < s.length(); r++) {
            char sk = s.charAt(r);
            while (sh.contains(sk)) {
                sh.remove(s.charAt(l));
                l++;
            }
            sh.add(sk);
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}