class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>ana=new HashMap<>();
       for(String s : strs){
        char []  sort = s.toCharArray();
        Arrays.sort(sort);
        String up = new String(sort);
        if(!ana.containsKey(up)){
            ana.put(up,new ArrayList<>());
        }
        ana.get(up).add(s);
       } 
       return new ArrayList<>(ana.values());
    }
}