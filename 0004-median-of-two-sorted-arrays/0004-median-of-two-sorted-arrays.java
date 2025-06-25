class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> merged = new ArrayList<>();
        for(int array : nums1){
            merged.add(array);
        }
        for(int array : nums2){
            merged.add(array);
        }
        Collections.sort(merged);
        int n = merged.size();
        if (n % 2 == 0) {
            int mid1 = merged.get(n / 2 - 1);
            int mid2 = merged.get(n / 2);
            return (mid1 + mid2) / 2.0;  
        } else {
            return merged.get(n / 2);
        }
    }
}