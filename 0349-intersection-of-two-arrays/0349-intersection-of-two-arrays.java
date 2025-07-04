class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> Set2 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            if (set1.contains(num)) {
                Set2.add(num);
            }
        }
        int[] result = new int[Set2.size()];
        int index = 0;
        for (int num : Set2) {
            result[index++] = num;
        }

        return result;
    }
}