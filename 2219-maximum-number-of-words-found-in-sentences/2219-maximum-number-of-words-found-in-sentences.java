class Solution {
    public int mostWordsFound(String[] sentences) {
       int count =0;
       for(int i =0;i<sentences.length;i++){
                String s = sentences[i];
                String str[] = s.split(" ");
                int temp = str.length;
                if (temp>count){
                    count =temp;
                }
        }
        return count; 
    }
}