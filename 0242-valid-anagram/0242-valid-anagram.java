class Solution {
    public boolean isAnagram(String s, String t) {
        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int k  = ch1.length;
        int n = ch2.length;
        if(k != n){
            return false;
        }
        for(int i =0;i<k;i++){
        if(ch1[i]!=ch2[i]){
            return false;
        }
        }
        return true;
    }
}