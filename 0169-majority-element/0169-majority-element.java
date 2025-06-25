class Solution {
    public int majorityElement(int[] nums) {
        int max = 0,ele=0;
        for(int i =0;i<nums.length;i++){
            int count =0;
            for(int j =i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>max){
                max=count;
                ele = nums[i];
            }
        }
        return ele;
    }
}