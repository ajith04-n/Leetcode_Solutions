class Solution {
    public boolean isPalindrome(int x) 
    {
        if (x < 0) {
            return false;
        }
        int org = x; 
        int rev = 0;
        while (x != 0) {
            int n = x % 10;
            rev = rev * 10 + n;
            x /= 10;
        }
        return org == rev;
    }
}