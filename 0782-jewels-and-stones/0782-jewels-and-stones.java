class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        for(Character ch : jewels.toCharArray()){
            set.add(ch);
        }
        int count =0;
        for(Character ch : stones.toCharArray()){
            if(set.contains(ch)){
                count++;
            }
        }
        return count;
    }
}