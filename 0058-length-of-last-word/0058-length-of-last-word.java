class Solution {
    public int lengthOfLastWord(String s) {
        String arr[] = s.split(" ");
        String m = arr[arr.length-1];
        int k = m.length();
        return k;
        
    }
}