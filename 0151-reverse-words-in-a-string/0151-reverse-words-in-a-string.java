class Solution {
    public String reverseWords(String s) {
        String k[] = s.trim().split("\\s+"); 
        String b = "";
        for(int i = k.length - 1; i >= 0; i--){
            b += k[i];
           if (i > 0) {
               b += " ";
            }
        }
        return b;
    }
}