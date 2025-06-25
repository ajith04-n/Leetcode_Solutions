class Solution {
    public int[] numberGame(int[] nums) {
        int k = nums.length;
        int arr[] = new int[k]; //final store
        Arrays.sort(nums); //sort
        for(int i =0;i<k;i+=2){
            for(int j =0;j<k;j++){
                if(nums[i]<nums[j]){
                arr[i] = nums[i];
                nums[i] = nums[j];
                nums[j] = arr[i];
                }
            }
        }
        return nums;
    }
}