class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int range = Math.min(i + k, n - 1); 
            for (int j = i + 1; j <= range; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
